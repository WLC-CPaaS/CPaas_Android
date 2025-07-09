# VoicemailApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDVoicemailGet**](VoicemailApi.md#v1AccountAccountIDVoicemailGet) | **GET** /v1/account/{accountID}/voicemail | Get Voicemail Box List
[**v1AccountAccountIDVoicemailPost**](VoicemailApi.md#v1AccountAccountIDVoicemailPost) | **POST** /v1/account/{accountID}/voicemail | Create Voicemail Box
[**v1AccountAccountIDVoicemailVoicemailIDDelete**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDDelete) | **DELETE** /v1/account/{accountID}/voicemail/{voicemailID} | Delete Voicemail Box
[**v1AccountAccountIDVoicemailVoicemailIDGet**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDGet) | **GET** /v1/account/{accountID}/voicemail/{voicemailID} | Get Voicemail Box Details
[**v1AccountAccountIDVoicemailVoicemailIDMessageGet**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageGet) | **GET** /v1/account/{accountID}/voicemail/{voicemailID}/message | Get Voicemail Message List
[**v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete) | **DELETE** /v1/account/{accountID}/voicemail/{voicemailID}/message/{messageID} | Delete Voicemail Message
[**v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet) | **GET** /v1/account/{accountID}/voicemail/{voicemailID}/message/{messageID} | Get Voicemail Message Details
[**v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut) | **PUT** /v1/account/{accountID}/voicemail/{voicemailID}/message/{messageID} | Update Voicemail Message
[**v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet) | **GET** /v1/account/{accountID}/voicemail/{voicemailID}/message/{messageID}/raw | Get Voicemail Message File
[**v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost) | **POST** /v1/account/{accountID}/voicemail/{voicemailID}/message/{messageID}/raw | Add Voicemail Message File
[**v1AccountAccountIDVoicemailVoicemailIDMessagePost**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDMessagePost) | **POST** /v1/account/{accountID}/voicemail/{voicemailID}/message | Create Voicemail Message
[**v1AccountAccountIDVoicemailVoicemailIDPut**](VoicemailApi.md#v1AccountAccountIDVoicemailVoicemailIDPut) | **PUT** /v1/account/{accountID}/voicemail/{voicemailID} | Update Voicemail Box



## v1AccountAccountIDVoicemailGet

> ServiceDocsVoicemailGetAll v1AccountAccountIDVoicemailGet(accountID, startKey, pageSize)

Get Voicemail Box List

List all voicemail boxes in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsVoicemailGetAll result = apiInstance.v1AccountAccountIDVoicemailGet(accountID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocsVoicemailGetAll**](ServiceDocsVoicemailGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailPost

> ServiceDocsVoicemailGetSingle v1AccountAccountIDVoicemailPost(accountID, voicemail)

Create Voicemail Box

Create a voicemail box for receiving and storing voicemail messages.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | account ID, 32 alphanumeric
ServiceVOIPVoicemailAddEditData voicemail = new ServiceVOIPVoicemailAddEditData(); // ServiceVOIPVoicemailAddEditData | voicemail payload fields
try {
    ServiceDocsVoicemailGetSingle result = apiInstance.v1AccountAccountIDVoicemailPost(accountID, voicemail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| account ID, 32 alphanumeric | [default to null]
 **voicemail** | [**ServiceVOIPVoicemailAddEditData**](ServiceVOIPVoicemailAddEditData.md)| voicemail payload fields |

### Return type

[**ServiceDocsVoicemailGetSingle**](ServiceDocsVoicemailGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDDelete

> ServiceDocsVoicemailGetSingle v1AccountAccountIDVoicemailVoicemailIDDelete(accountID, voicemailID)

Delete Voicemail Box

Delete a voicemail box in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
try {
    ServiceDocsVoicemailGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDDelete(accountID, voicemailID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsVoicemailGetSingle**](ServiceDocsVoicemailGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDGet

> ServiceDocsVoicemailGetSingle v1AccountAccountIDVoicemailVoicemailIDGet(accountID, voicemailID)

Get Voicemail Box Details

Get information about a single voicemail box.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
try {
    ServiceDocsVoicemailGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDGet(accountID, voicemailID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsVoicemailGetSingle**](ServiceDocsVoicemailGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessageGet

> ServiceDocsVoicemailMessageGetAll v1AccountAccountIDVoicemailVoicemailIDMessageGet(accountID, voicemailID, startKey, pageSize)

Get Voicemail Message List

Get a list of voicemail messages from an account&#39;s voicemail box.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | voicemail ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsVoicemailMessageGetAll result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageGet(accountID, voicemailID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| voicemail ID, 32 alpha numeric | [default to null]
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocsVoicemailMessageGetAll**](ServiceDocsVoicemailMessageGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete

> ServiceDocsVoicemailMessageGetSingle v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete(accountID, voicemailID, messageID)

Delete Voicemail Message

Delete a voicemail message from a voicemail box in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
String messageID = null; // String | message ID, 32 alpha numeric
try {
    ServiceDocsVoicemailMessageGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete(accountID, voicemailID, messageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]
 **messageID** | **String**| message ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsVoicemailMessageGetSingle**](ServiceDocsVoicemailMessageGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet

> ServiceDocsVoicemailMessageGetSingle v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet(accountID, voicemailID, messageID)

Get Voicemail Message Details

Retrieve the container details of an individual voicemail message. This includes a reference to the audio file, but not the message itself.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
String messageID = null; // String | Message ID, 39 (yyyymm-<32 id>)
try {
    ServiceDocsVoicemailMessageGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet(accountID, voicemailID, messageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]
 **messageID** | **String**| Message ID, 39 (yyyymm-&lt;32 id&gt;) | [default to null]

### Return type

[**ServiceDocsVoicemailMessageGetSingle**](ServiceDocsVoicemailMessageGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut

> ServiceDocsVoicemailMessageGetSingle v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut(accountID, voicemailID, messageID, reqBody)

Update Voicemail Message

Copy or move a voicemail message to a different folder in the same voicemail box or move the message to a separate voicemail box.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
String messageID = null; // String | Message ID, 39 (yyyymm-<32 id>)
ServiceVOIPVoicemailMessageChange reqBody = new ServiceVOIPVoicemailMessageChange(); // ServiceVOIPVoicemailMessageChange | payload fields
try {
    ServiceDocsVoicemailMessageGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut(accountID, voicemailID, messageID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]
 **messageID** | **String**| Message ID, 39 (yyyymm-&lt;32 id&gt;) | [default to null]
 **reqBody** | [**ServiceVOIPVoicemailMessageChange**](ServiceVOIPVoicemailMessageChange.md)| payload fields |

### Return type

[**ServiceDocsVoicemailMessageGetSingle**](ServiceDocsVoicemailMessageGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet

> File v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet(accountID, voicemailID, messageID)

Get Voicemail Message File

Get the original audio content of a specific voicemail message identified by its unique ID within an account&#39;s voicemail box. URL Param \&quot;voicemailID\&quot; is a unique 32-character alphanumeric identifier assigned by the system, which refers to a specific voicemail box. URL Param \&quot;messageID\&quot; is a unique 32-character alphanumeric identifier assigned by the system, which refers to a specific message within a voicemail box.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, unique 32-character alphanumeric identifier
String voicemailID = null; // String | Voicemail Box ID, unique 32-character alphanumeric identifier
String messageID = null; // String | Message ID, unique 32-character alphanumeric identifier
try {
    File result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet(accountID, voicemailID, messageID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, unique 32-character alphanumeric identifier | [default to null]
 **voicemailID** | **String**| Voicemail Box ID, unique 32-character alphanumeric identifier | [default to null]
 **messageID** | **String**| Message ID, unique 32-character alphanumeric identifier | [default to null]

### Return type

[**File**](File.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream


## v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost

> Map&lt;String, OasAnyTypeNotMapped&gt; v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost(accountID, voicemailID, messageID, file)

Add Voicemail Message File

Associate an audio recording file with the voicemail to fully complete the message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alphanumeric characters
String voicemailID = null; // String | Voicemail ID, 32 alphanumeric characters
String messageID = null; // String | Message ID, 32 alphanumeric characters
File file = null; // File | Audio file to upload
try {
    Map<String, OasAnyTypeNotMapped> result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost(accountID, voicemailID, messageID, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessageMessageIDRawPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alphanumeric characters | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alphanumeric characters | [default to null]
 **messageID** | **String**| Message ID, 32 alphanumeric characters | [default to null]
 **file** | **File**| Audio file to upload | [default to null]

### Return type

[**Map&lt;String, OasAnyTypeNotMapped&gt;**](OasAnyTypeNotMapped.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDMessagePost

> ServiceDocsVoicemailMessageGetSingle v1AccountAccountIDVoicemailVoicemailIDMessagePost(accountID, voicemailID, message)

Create Voicemail Message

Create the container information for a recorded voicemail message in a voicemail box.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | account ID, 32 alphanumeric
String voicemailID = null; // String | voicemail ID, 32 alphanumeric
ServiceVOIPVoicemailMessageAddData message = new ServiceVOIPVoicemailMessageAddData(); // ServiceVOIPVoicemailMessageAddData | voicemail message payload fields
try {
    ServiceDocsVoicemailMessageGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDMessagePost(accountID, voicemailID, message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDMessagePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| account ID, 32 alphanumeric | [default to null]
 **voicemailID** | **String**| voicemail ID, 32 alphanumeric | [default to null]
 **message** | [**ServiceVOIPVoicemailMessageAddData**](ServiceVOIPVoicemailMessageAddData.md)| voicemail message payload fields |

### Return type

[**ServiceDocsVoicemailMessageGetSingle**](ServiceDocsVoicemailMessageGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDVoicemailVoicemailIDPut

> ServiceDocsVoicemailGetSingle v1AccountAccountIDVoicemailVoicemailIDPut(accountID, voicemailID, reqBody)

Update Voicemail Box

Update the settings in an individual voicemail box, such as the owner, PIN, etc.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoicemailApi;

VoicemailApi apiInstance = new VoicemailApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String voicemailID = null; // String | Voicemail ID, 32 alpha numeric
ServiceVOIPVoicemailAddEditData reqBody = new ServiceVOIPVoicemailAddEditData(); // ServiceVOIPVoicemailAddEditData | payload fields
try {
    ServiceDocsVoicemailGetSingle result = apiInstance.v1AccountAccountIDVoicemailVoicemailIDPut(accountID, voicemailID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoicemailApi#v1AccountAccountIDVoicemailVoicemailIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **voicemailID** | **String**| Voicemail ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPVoicemailAddEditData**](ServiceVOIPVoicemailAddEditData.md)| payload fields |

### Return type

[**ServiceDocsVoicemailGetSingle**](ServiceDocsVoicemailGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

