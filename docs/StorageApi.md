# StorageApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDStorageDelete**](StorageApi.md#v1AccountAccountIDStorageDelete) | **DELETE** /v1/account/{accountID}/storage | Delete Storage
[**v1AccountAccountIDStorageGet**](StorageApi.md#v1AccountAccountIDStorageGet) | **GET** /v1/account/{accountID}/storage | Get Storage Details
[**v1AccountAccountIDStoragePost**](StorageApi.md#v1AccountAccountIDStoragePost) | **POST** /v1/account/{accountID}/storage | Create Storage
[**v1AccountAccountIDStoragePut**](StorageApi.md#v1AccountAccountIDStoragePut) | **PUT** /v1/account/{accountID}/storage | Update Storage



## v1AccountAccountIDStorageDelete

> ServiceDocsStorageGet v1AccountAccountIDStorageDelete(accountID)

Delete Storage

Delete items that are stored in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.StorageApi;

StorageApi apiInstance = new StorageApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsStorageGet result = apiInstance.v1AccountAccountIDStorageDelete(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#v1AccountAccountIDStorageDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsStorageGet**](ServiceDocsStorageGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDStorageGet

> ServiceDocsStorageGet v1AccountAccountIDStorageGet(accountID)

Get Storage Details

Retrieve storage details for an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.StorageApi;

StorageApi apiInstance = new StorageApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsStorageGet result = apiInstance.v1AccountAccountIDStorageGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#v1AccountAccountIDStorageGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsStorageGet**](ServiceDocsStorageGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDStoragePost

> ServiceDocsStorageGet v1AccountAccountIDStoragePost(accountID, reqBody)

Create Storage

Create storage in an account for voicemails, call recordings, faxes, etc.

### Example

```java
// Import classes:
//import org.openapitools.client.api.StorageApi;

StorageApi apiInstance = new StorageApi();
String accountID = null; // String | Account ID, 32 alpha numeric
ServiceVOIPStorageAddEditData reqBody = new ServiceVOIPStorageAddEditData(); // ServiceVOIPStorageAddEditData | payload fields
try {
    ServiceDocsStorageGet result = apiInstance.v1AccountAccountIDStoragePost(accountID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#v1AccountAccountIDStoragePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPStorageAddEditData**](ServiceVOIPStorageAddEditData.md)| payload fields |

### Return type

[**ServiceDocsStorageGet**](ServiceDocsStorageGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDStoragePut

> ServiceDocsStorageGet v1AccountAccountIDStoragePut(accountID, reqBody)

Update Storage

Modify the names of metadata to make it easier to locate (e.g., change the name of voicemail_storage to voicemail_and_callrecordings_storage, etc.).

### Example

```java
// Import classes:
//import org.openapitools.client.api.StorageApi;

StorageApi apiInstance = new StorageApi();
String accountID = null; // String | Account ID, 32 alpha numeric
ServiceVOIPStorageAddEditData reqBody = new ServiceVOIPStorageAddEditData(); // ServiceVOIPStorageAddEditData | payload fields
try {
    ServiceDocsStorageGet result = apiInstance.v1AccountAccountIDStoragePut(accountID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#v1AccountAccountIDStoragePut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPStorageAddEditData**](ServiceVOIPStorageAddEditData.md)| payload fields |

### Return type

[**ServiceDocsStorageGet**](ServiceDocsStorageGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

