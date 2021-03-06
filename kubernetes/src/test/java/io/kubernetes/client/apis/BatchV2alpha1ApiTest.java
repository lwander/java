/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V2alpha1CronJob;
import io.kubernetes.client.models.V2alpha1CronJobList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchV2alpha1Api
 */
@Ignore
public class BatchV2alpha1ApiTest {

    private final BatchV2alpha1Api api = new BatchV2alpha1Api();

    
    /**
     * 
     *
     * create a CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.createNamespacedCronJob(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedScheduledJobTest() throws ApiException {
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.createNamespacedScheduledJob(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedCronJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedScheduledJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedScheduledJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedCronJob(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedScheduledJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedScheduledJob(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCronJobForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V2alpha1CronJobList response = api.listCronJobForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedCronJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V2alpha1CronJobList response = api.listNamespacedCronJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedScheduledJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V2alpha1CronJobList response = api.listNamespacedScheduledJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listScheduledJobForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V2alpha1CronJobList response = api.listScheduledJobForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V2alpha1CronJob response = api.patchNamespacedCronJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V2alpha1CronJob response = api.patchNamespacedCronJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedScheduledJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V2alpha1CronJob response = api.patchNamespacedScheduledJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedScheduledJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V2alpha1CronJob response = api.patchNamespacedScheduledJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V2alpha1CronJob response = api.readNamespacedCronJob(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V2alpha1CronJob response = api.readNamespacedCronJobStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedScheduledJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V2alpha1CronJob response = api.readNamespacedScheduledJob(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedScheduledJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V2alpha1CronJob response = api.readNamespacedScheduledJobStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCronJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.replaceNamespacedCronJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified CronJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCronJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.replaceNamespacedCronJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedScheduledJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.replaceNamespacedScheduledJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified ScheduledJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedScheduledJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V2alpha1CronJob body = null;
        String pretty = null;
        V2alpha1CronJob response = api.replaceNamespacedScheduledJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
