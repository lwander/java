# Deploy to Maven release process

This document describes how to configure and use the [Maven release
plugin](http://maven.apache.org/maven-release/maven-release-plugin) to publish
to [Sonatype](http://central.sonatype.org/).

## One time setup

You will need to have the following in place:

1. SSH keys for an account capable of pushing commits & tags to
   https://github.com/kubernetes-client/java. These will be used by the release
   plugin to push an updated pom.xml along with a tag corresponding to the
   release being performed. If you don't have these keys, follow [this
   guide](https://help.github.com/articles/connecting-to-github-with-ssh/).

2. [A Sonatype JIRA
   account](https://issues.sonatype.org/secure/Signup!default.jspa) that's been
   authorized to publish to `io.kubernetes:client-java`. With your credentials
   in-hand, place these in your `settings.xml` (typically
   `~/.m2/settings.xml`) config file. An example config is:
   ```xml
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>your-jira-id</username>
      <password>your-jira-pwd</password>
    </server>
  </servers>
</settings>
   ```

3. A GPG key (specifics TBD)

## Doing a release

There are two commands to be run in the root directory:

1. `mvn release:prepare`: This will prompt you for the version to release as
   well as the next version to mark as `SNAPSHOT`. The defaults should be fine.
   This will commit an updated `pom.xml`, write configuration to
   `release.properties` for the upcoming release, and push a commit alongside
   a git tag for this release. If you don't want to do a dry run first, supply
   `-DdryRun=true` to the `mvn` command. There is more documentation
   [here](http://maven.apache.org/maven-release/maven-release-plugin/examples/prepare-release.html).

2. `mvn release:perform`: This will take the prior command's generated
   `release.properties` file as configuration, sign your artifacts with your
   GPG key, and publish the release to Maven central.

## Troubleshooting

Let's add entries here as we run into problems.

* **Authentication problems**: Ensure your git SSH keys & JIRA account have
  access to https://github.com/kubernetes-client/java and the
  `io.kubernetes:client-java` repositories respectively. If this is the case,
  check `mvn release:<command>` output for complaints of malformed
  `settings.xml` entries.

* **Undo a mistake**: If you've made a mistake during a release, and the
  release hasn't been published, running `mvn release:clean` will unstage local
  changes and remove generated release configuration, returning the state of
  your git repo to normal.
