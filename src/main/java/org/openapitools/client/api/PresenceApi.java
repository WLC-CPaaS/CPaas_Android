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
import org.openapitools.client.model.ServiceAPIResponse;
import org.openapitools.client.model.ServiceDocsPresenceGet;
import org.openapitools.client.model.ServiceVOIPPresenceSetResetEditData;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PresenceApi {
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
  * Set/Reset Presence for Extension
  * Set or reset the presence status of an extension.
   * @param accountID Account ID, 32 alpha numeric
   * @param extension Extension
   * @param reqBody payload fields
   * @return ServiceAPIResponse
  */
  public ServiceAPIResponse v1AccountAccountIDPresenceExtensionPut (String accountID, String extension, ServiceVOIPPresenceSetResetEditData reqBody) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = reqBody;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceExtensionPut"));
    }
    // verify the required parameter 'extension' is set
    if (extension == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extension' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'extension' when calling v1AccountAccountIDPresenceExtensionPut"));
    }
    // verify the required parameter 'reqBody' is set
    if (reqBody == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reqBody' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'reqBody' when calling v1AccountAccountIDPresenceExtensionPut"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/presence/{extension}".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "extension" + "\\}", apiInvoker.escapeString(extension.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
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
         return (ServiceAPIResponse) ApiInvoker.deserialize(localVarResponse, "", ServiceAPIResponse.class);
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
   * Set/Reset Presence for Extension
   * Set or reset the presence status of an extension.
   * @param accountID Account ID, 32 alpha numeric   * @param extension Extension   * @param reqBody payload fields
  */
  public void v1AccountAccountIDPresenceExtensionPut (String accountID, String extension, ServiceVOIPPresenceSetResetEditData reqBody, final Response.Listener<ServiceAPIResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = reqBody;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceExtensionPut"));
    }
    // verify the required parameter 'extension' is set
    if (extension == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'extension' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'extension' when calling v1AccountAccountIDPresenceExtensionPut"));
    }
    // verify the required parameter 'reqBody' is set
    if (reqBody == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reqBody' when calling v1AccountAccountIDPresenceExtensionPut",
        new ApiException(400, "Missing the required parameter 'reqBody' when calling v1AccountAccountIDPresenceExtensionPut"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/presence/{extension}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "extension" + "\\}", apiInvoker.escapeString(extension.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
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
              responseListener.onResponse((ServiceAPIResponse) ApiInvoker.deserialize(localVarResponse,  "", ServiceAPIResponse.class));
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
  * Get Presence Details
  * Retrieve details of presence subscriptions in an account.
   * @param accountID Account ID, 32 alpha numeric
   * @return ServiceDocsPresenceGet
  */
  public ServiceDocsPresenceGet v1AccountAccountIDPresenceGet (String accountID) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceGet"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/presence".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

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
         return (ServiceDocsPresenceGet) ApiInvoker.deserialize(localVarResponse, "", ServiceDocsPresenceGet.class);
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
   * Get Presence Details
   * Retrieve details of presence subscriptions in an account.
   * @param accountID Account ID, 32 alpha numeric
  */
  public void v1AccountAccountIDPresenceGet (String accountID, final Response.Listener<ServiceDocsPresenceGet> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceGet",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDPresenceGet"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/presence".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString()));

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
              responseListener.onResponse((ServiceDocsPresenceGet) ApiInvoker.deserialize(localVarResponse,  "", ServiceDocsPresenceGet.class));
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
  * Set/Reset Presence for User
  * Set or reset the presence status of a user within an account.
   * @param accountID Account ID, 32 alpha numeric
   * @param userID User ID, 32 alpha numeric
   * @param reqBody payload fields
   * @return ServiceAPIResponse
  */
  public ServiceAPIResponse v1AccountAccountIDUserUserIDPresencePut (String accountID, String userID, ServiceVOIPPresenceSetResetEditData reqBody) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = reqBody;
    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }
    // verify the required parameter 'userID' is set
    if (userID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userID' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'userID' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }
    // verify the required parameter 'reqBody' is set
    if (reqBody == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reqBody' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'reqBody' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/user/{userID}/presence".replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "userID" + "\\}", apiInvoker.escapeString(userID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
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
         return (ServiceAPIResponse) ApiInvoker.deserialize(localVarResponse, "", ServiceAPIResponse.class);
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
   * Set/Reset Presence for User
   * Set or reset the presence status of a user within an account.
   * @param accountID Account ID, 32 alpha numeric   * @param userID User ID, 32 alpha numeric   * @param reqBody payload fields
  */
  public void v1AccountAccountIDUserUserIDPresencePut (String accountID, String userID, ServiceVOIPPresenceSetResetEditData reqBody, final Response.Listener<ServiceAPIResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = reqBody;

    // verify the required parameter 'accountID' is set
    if (accountID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountID' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'accountID' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }
    // verify the required parameter 'userID' is set
    if (userID == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userID' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'userID' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }
    // verify the required parameter 'reqBody' is set
    if (reqBody == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'reqBody' when calling v1AccountAccountIDUserUserIDPresencePut",
        new ApiException(400, "Missing the required parameter 'reqBody' when calling v1AccountAccountIDUserUserIDPresencePut"));
    }

    // create path and map variables
    String path = "/v1/account/{accountID}/user/{userID}/presence".replaceAll("\\{format\\}","json").replaceAll("\\{" + "accountID" + "\\}", apiInvoker.escapeString(accountID.toString())).replaceAll("\\{" + "userID" + "\\}", apiInvoker.escapeString(userID.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
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
              responseListener.onResponse((ServiceAPIResponse) ApiInvoker.deserialize(localVarResponse,  "", ServiceAPIResponse.class));
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
