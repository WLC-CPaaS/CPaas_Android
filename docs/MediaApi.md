# MediaApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDMediaMediaIDFileGet**](MediaApi.md#v1AccountAccountIDMediaMediaIDFileGet) | **GET** /v1/account/{accountID}/media/{mediaID}/file | Get Media File
[**v1AccountAccountIDMediaMediaIDFilePost**](MediaApi.md#v1AccountAccountIDMediaMediaIDFilePost) | **POST** /v1/account/{accountID}/media/{mediaID}/file | Add Media File
[**v1AccountAccountidMediaGet**](MediaApi.md#v1AccountAccountidMediaGet) | **GET** /v1/account/{accountid}/media | Get Media List
[**v1AccountAccountidMediaMediaidDelete**](MediaApi.md#v1AccountAccountidMediaMediaidDelete) | **DELETE** /v1/account/{accountid}/media/{mediaid} | Delete Media
[**v1AccountAccountidMediaMediaidGet**](MediaApi.md#v1AccountAccountidMediaMediaidGet) | **GET** /v1/account/{accountid}/media/{mediaid} | Get Media Details
[**v1AccountAccountidMediaPost**](MediaApi.md#v1AccountAccountidMediaPost) | **POST** /v1/account/{accountid}/media | Create Media



## v1AccountAccountIDMediaMediaIDFileGet

> File v1AccountAccountIDMediaMediaIDFileGet(accountID, mediaID)

Get Media File

Gather data about the media objects in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String mediaID = null; // String | Media ID, 32 alpha numeric
try {
    File result = apiInstance.v1AccountAccountIDMediaMediaIDFileGet(accountID, mediaID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountIDMediaMediaIDFileGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **mediaID** | **String**| Media ID, 32 alpha numeric | [default to null]

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, audio/mp3, audio/mpeg, audio/mpeg3, audio/x-wav, audio/wav, audio/ogg, video/x-flv, video/h264, video/mpeg, video/quicktime, video/mp4, video/webm


## v1AccountAccountIDMediaMediaIDFilePost

> ServiceDocsMediaGetSingle v1AccountAccountIDMediaMediaIDFilePost(accountID, mediaID, file)

Add Media File

Include a media file that is connected to a media object in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String mediaID = null; // String | Media ID, 32 alpha numeric
File file = null; // File | Media file
try {
    ServiceDocsMediaGetSingle result = apiInstance.v1AccountAccountIDMediaMediaIDFilePost(accountID, mediaID, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountIDMediaMediaIDFilePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **mediaID** | **String**| Media ID, 32 alpha numeric | [default to null]
 **file** | **File**| Media file | [default to null]

### Return type

[**ServiceDocsMediaGetSingle**](ServiceDocsMediaGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## v1AccountAccountidMediaGet

> ServiceDocsMediaGetAll v1AccountAccountidMediaGet(accountid, startKey, pageSize)

Get Media List

View all media files for an account in your organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsMediaGetAll result = apiInstance.v1AccountAccountidMediaGet(accountid, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountidMediaGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocsMediaGetAll**](ServiceDocsMediaGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidMediaMediaidDelete

> ServiceDocsMediaGetSingle v1AccountAccountidMediaMediaidDelete(accountid, mediaid)

Delete Media

Remove a media file that is no longer in use from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String mediaid = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsMediaGetSingle result = apiInstance.v1AccountAccountidMediaMediaidDelete(accountid, mediaid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountidMediaMediaidDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **mediaid** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMediaGetSingle**](ServiceDocsMediaGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidMediaMediaidGet

> ServiceDocsMediaGetSingle v1AccountAccountidMediaMediaidGet(accountid, mediaid)

Get Media Details

Permit users to view an account&#39;s specific media information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String mediaid = null; // String | Media ID, 32 alpha numeric
try {
    ServiceDocsMediaGetSingle result = apiInstance.v1AccountAccountidMediaMediaidGet(accountid, mediaid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountidMediaMediaidGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **mediaid** | **String**| Media ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMediaGetSingle**](ServiceDocsMediaGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidMediaPost

> ServiceDocsMediaGetSingle v1AccountAccountidMediaPost(accountid, media)

Create Media

Generate a media object to allow users to upload a media file in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MediaApi;

MediaApi apiInstance = new MediaApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPMediaAddEditData media = new ServiceVOIPMediaAddEditData(); // ServiceVOIPMediaAddEditData | Media creation or update payload
try {
    ServiceDocsMediaGetSingle result = apiInstance.v1AccountAccountidMediaPost(accountid, media);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#v1AccountAccountidMediaPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **media** | [**ServiceVOIPMediaAddEditData**](ServiceVOIPMediaAddEditData.md)| Media creation or update payload |

### Return type

[**ServiceDocsMediaGetSingle**](ServiceDocsMediaGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

