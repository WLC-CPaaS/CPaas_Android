# WebhookApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1WebhookAccountAccountIDGet**](WebhookApi.md#v1WebhookAccountAccountIDGet) | **GET** /v1/webhook/account/{accountID} | Get Webhook List
[**v1WebhookAccountAccountIDPost**](WebhookApi.md#v1WebhookAccountAccountIDPost) | **POST** /v1/webhook/account/{accountID} | Create Webhook
[**v1WebhookAccountAccountIDWebhookIDDelete**](WebhookApi.md#v1WebhookAccountAccountIDWebhookIDDelete) | **DELETE** /v1/webhook/account/{accountID}/{webhookID} | Delete Webhook
[**v1WebhookAccountAccountIDWebhookIDGet**](WebhookApi.md#v1WebhookAccountAccountIDWebhookIDGet) | **GET** /v1/webhook/account/{accountID}/{webhookID} | Get Webhook Details
[**v1WebhookAccountAccountIDWebhookIDPut**](WebhookApi.md#v1WebhookAccountAccountIDWebhookIDPut) | **PUT** /v1/webhook/account/{accountID}/{webhookID} | Update Webhook



## v1WebhookAccountAccountIDGet

> ServiceDocsWebhookGetAll v1WebhookAccountAccountIDGet(accountID, pageSize, currentPage)

Get Webhook List

Retrieve the webhook list in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String accountID = null; // String | Account ID
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
Integer currentPage = null; // Integer | Current Page
try {
    ServiceDocsWebhookGetAll result = apiInstance.v1WebhookAccountAccountIDGet(accountID, pageSize, currentPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#v1WebhookAccountAccountIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]
 **currentPage** | **Integer**| Current Page | [optional] [default to null]

### Return type

[**ServiceDocsWebhookGetAll**](ServiceDocsWebhookGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1WebhookAccountAccountIDPost

> ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDPost(accountID, body)

Create Webhook

Create a webhook for a specific account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String accountID = null; // String | Account ID
ServiceWebhookAdd body = new ServiceWebhookAdd(); // ServiceWebhookAdd | Webhook data
try {
    ServiceDocsWebhookGetSingle result = apiInstance.v1WebhookAccountAccountIDPost(accountID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#v1WebhookAccountAccountIDPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **body** | [**ServiceWebhookAdd**](ServiceWebhookAdd.md)| Webhook data |

### Return type

[**ServiceDocsWebhookGetSingle**](ServiceDocsWebhookGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1WebhookAccountAccountIDWebhookIDDelete

> ServiceDocsWebhookDelete v1WebhookAccountAccountIDWebhookIDDelete(accountID, webhookID)

Delete Webhook

Remove a webhook identified by its ID for a particular account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String accountID = null; // String | Account ID
Integer webhookID = null; // Integer | Webhook ID
try {
    ServiceDocsWebhookDelete result = apiInstance.v1WebhookAccountAccountIDWebhookIDDelete(accountID, webhookID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#v1WebhookAccountAccountIDWebhookIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **webhookID** | **Integer**| Webhook ID | [default to null]

### Return type

[**ServiceDocsWebhookDelete**](ServiceDocsWebhookDelete.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1WebhookAccountAccountIDWebhookIDGet

> ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDWebhookIDGet(accountID, webhookID)

Get Webhook Details

Access details about a single webhook ID for an individual account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String accountID = null; // String | Account ID
Integer webhookID = null; // Integer | Webhook ID
try {
    ServiceDocsWebhookGetSingle result = apiInstance.v1WebhookAccountAccountIDWebhookIDGet(accountID, webhookID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#v1WebhookAccountAccountIDWebhookIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **webhookID** | **Integer**| Webhook ID | [default to null]

### Return type

[**ServiceDocsWebhookGetSingle**](ServiceDocsWebhookGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1WebhookAccountAccountIDWebhookIDPut

> ServiceDocsWebhookGetSingle v1WebhookAccountAccountIDWebhookIDPut(accountID, webhookID, body)

Update Webhook

Update a webhook identified by its ID for a distinct account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.WebhookApi;

WebhookApi apiInstance = new WebhookApi();
String accountID = null; // String | Account ID
String webhookID = null; // String | Webhook ID
ServiceWebhookEdit body = new ServiceWebhookEdit(); // ServiceWebhookEdit | Updated webhook data
try {
    ServiceDocsWebhookGetSingle result = apiInstance.v1WebhookAccountAccountIDWebhookIDPut(accountID, webhookID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#v1WebhookAccountAccountIDWebhookIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **webhookID** | **String**| Webhook ID | [default to null]
 **body** | [**ServiceWebhookEdit**](ServiceWebhookEdit.md)| Updated webhook data |

### Return type

[**ServiceDocsWebhookGetSingle**](ServiceDocsWebhookGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

