/**
 * White Label Communications CPaas API Documentation
 * A CPaaS platform API
 *
 * The version of the OpenAPI document: 1.1
 * Contact: support@whitelabelcomm.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.openapitools.client.model.CPAASError;
import org.openapitools.client.model.ServiceDocsWebhookDelete;
import org.openapitools.client.model.ServiceDocsWebhookGetAll;
import org.openapitools.client.model.ServiceDocsWebhookGetSingle;
import org.openapitools.client.model.ServiceWebhookAdd;
import org.openapitools.client.model.ServiceWebhookEdit;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class WebhookApi {
  String basePath = "http://api.beta.cpaaslabs.net";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get Webhook List
  * Retrieve the webhook list in an account.
   * @param accountID Account ID
   * @param pageSize number of records to return, range 1 to 50
   * @param currentPage Current Page
   * @return ServiceDocsWebhookGetAll
  */
  public ServiceDocsWebhookGetAll v1WebhookAccountAccountIDGet (String accountID, Integer pageSize, Integer currentPage) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDGet"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_size", pageSize));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "current_page", currentPage));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ServiceDocsWebhookGetAll) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsWebhookGetAll.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get Webhook List
   * Retrieve the webhook list in an account.
   * @param accountID Account ID   * @param pageSize number of records to return, range 1 to 50   * @param currentPage Current Page
  */
  public void v1WebhookAccountAccountIDGet (String accountID, Integer pageSize, Integer currentPage, final Response.Listener<ServiceDocsWebhookGetAll> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDGet"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "page_size", pageSize));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "current_page", currentPage));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ServiceDocsWebhookGetAll) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsWebhookGetAll.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create Webhook
  * Create a webhook for a specific account ID.
   * @param accountID Account ID
   * @param body Webhook data
   * @return ServiceDocsWebhookGetSingle
  */
  public ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDPost (String accountID, ServiceWebhookAdd body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDPost",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDPost"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1WebhookAccountAccountIDPost",
        new ApiException(400, "Missing the required parameter 'body' when calling v1WebhookAccountAccountIDPost"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsWebhookGetSingle.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Create Webhook
   * Create a webhook for a specific account ID.
   * @param accountID Account ID   * @param body Webhook data
  */
  public void v1WebhookAccountAccountIDPost (String accountID, ServiceWebhookAdd body, final Response.Listener<ServiceDocsWebhookGetSingle> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDPost",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDPost"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1WebhookAccountAccountIDPost",
        new ApiException(400, "Missing the required parameter 'body' when calling v1WebhookAccountAccountIDPost"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsWebhookGetSingle.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete Webhook
  * Remove a webhook identified by its ID for a particular account ID.
   * @param accountID Account ID
   * @param webhookID Webhook ID
   * @return ServiceDocsWebhookDelete
  */
  public ServiceDocsWebhookDelete v1WebhookAccountAccountIDWebhookIDDelete (String accountID, Integer webhookID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDDelete",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDDelete"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDDelete",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDDelete"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ServiceDocsWebhookDelete) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsWebhookDelete.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete Webhook
   * Remove a webhook identified by its ID for a particular account ID.
   * @param accountID Account ID   * @param webhookID Webhook ID
  */
  public void v1WebhookAccountAccountIDWebhookIDDelete (String accountID, Integer webhookID, final Response.Listener<ServiceDocsWebhookDelete> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDDelete",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDDelete"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDDelete",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDDelete"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ServiceDocsWebhookDelete) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsWebhookDelete.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get Webhook Details
  * Access details about a single webhook ID for an individual account ID.
   * @param accountID Account ID
   * @param webhookID Webhook ID
   * @return ServiceDocsWebhookGetSingle
  */
  public ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDWebhookIDGet (String accountID, Integer webhookID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDGet"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDGet",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDGet"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsWebhookGetSingle.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get Webhook Details
   * Access details about a single webhook ID for an individual account ID.
   * @param accountID Account ID   * @param webhookID Webhook ID
  */
  public void v1WebhookAccountAccountIDWebhookIDGet (String accountID, Integer webhookID, final Response.Listener<ServiceDocsWebhookGetSingle> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDGet"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDGet",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDGet"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsWebhookGetSingle.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update Webhook
  * Update a webhook identified by its ID for a distinct account ID.
   * @param accountID Account ID
   * @param webhookID Webhook ID
   * @param body Updated webhook data
   * @return ServiceDocsWebhookGetSingle
  */
  public ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDWebhookIDPut (String accountID, String webhookID, ServiceWebhookEdit body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = body;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'body' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsWebhookGetSingle.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Update Webhook
   * Update a webhook identified by its ID for a distinct account ID.
   * @param accountID Account ID   * @param webhookID Webhook ID   * @param body Updated webhook data
  */
  public void v1WebhookAccountAccountIDWebhookIDPut (String accountID, String webhookID, ServiceWebhookEdit body, final Response.Listener<ServiceDocsWebhookGetSingle> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }
    // verify the required parameter 'webhookID' is set
    if (webhookID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'webhookID' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling v1WebhookAccountAccountIDWebhookIDPut",
        new ApiException(400, "Missing the required parameter 'body' when calling v1WebhookAccountAccountIDWebhookIDPut"));
    }

    // create path and map variables
    String path = "/v1/webhook/account/{accountID}/{webhookID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "webhookID" + "\\}", apiInvoker.escapeString(webhookID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "BearerAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ServiceDocsWebhookGetSingle) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsWebhookGetSingle.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
