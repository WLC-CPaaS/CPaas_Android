# CallflowApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDCallflowCallflowIDDelete**](CallflowApi.md#v1AccountAccountIDCallflowCallflowIDDelete) | **DELETE** /v1/account/{accountID}/callflow/{callflowID} | Delete Call Group
[**v1AccountAccountIDCallflowCallflowIDGet**](CallflowApi.md#v1AccountAccountIDCallflowCallflowIDGet) | **GET** /v1/account/{accountID}/callflow/{callflowID} | Get Call Group Details
[**v1AccountAccountIDCallflowCallflowIDPut**](CallflowApi.md#v1AccountAccountIDCallflowCallflowIDPut) | **PUT** /v1/account/{accountID}/callflow/{callflowID} | Update Call Group
[**v1AccountAccountIDCallflowGet**](CallflowApi.md#v1AccountAccountIDCallflowGet) | **GET** /v1/account/{accountID}/callflow | Get Callflow List
[**v1AccountAccountIDCallflowPost**](CallflowApi.md#v1AccountAccountIDCallflowPost) | **POST** /v1/account/{accountID}/callflow | Create Call Group



## v1AccountAccountIDCallflowCallflowIDDelete

> ServiceDocsCallflowGetSingle v1AccountAccountIDCallflowCallflowIDDelete(accountID, callflowID)

Delete Call Group

Delete a callflow in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallflowApi;

CallflowApi apiInstance = new CallflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String callflowID = null; // String | callflow ID, 32 alpha numeric
try {
    ServiceDocsCallflowGetSingle result = apiInstance.v1AccountAccountIDCallflowCallflowIDDelete(accountID, callflowID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallflowApi#v1AccountAccountIDCallflowCallflowIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **callflowID** | **String**| callflow ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsCallflowGetSingle**](ServiceDocsCallflowGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDCallflowCallflowIDGet

> ServiceDocsCallflowGetSingle v1AccountAccountIDCallflowCallflowIDGet(accountID, callflowID)

Get Call Group Details

Get the details for a single callflow in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallflowApi;

CallflowApi apiInstance = new CallflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String callflowID = null; // String | Callflow ID, 32 alpha numeric
try {
    ServiceDocsCallflowGetSingle result = apiInstance.v1AccountAccountIDCallflowCallflowIDGet(accountID, callflowID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallflowApi#v1AccountAccountIDCallflowCallflowIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **callflowID** | **String**| Callflow ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsCallflowGetSingle**](ServiceDocsCallflowGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDCallflowCallflowIDPut

> ServiceDocsCallflowGetSingle v1AccountAccountIDCallflowCallflowIDPut(accountID, callflowID, reqBody)

Update Call Group

Update the details for a single callflow in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallflowApi;

CallflowApi apiInstance = new CallflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String callflowID = null; // String | Callflow ID, 32 alpha numeric
ServiceCallflowAddEditData reqBody = new ServiceCallflowAddEditData(); // ServiceCallflowAddEditData | payload fields
try {
    ServiceDocsCallflowGetSingle result = apiInstance.v1AccountAccountIDCallflowCallflowIDPut(accountID, callflowID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallflowApi#v1AccountAccountIDCallflowCallflowIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **callflowID** | **String**| Callflow ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceCallflowAddEditData**](ServiceCallflowAddEditData.md)| payload fields |

### Return type

[**ServiceDocsCallflowGetSingle**](ServiceDocsCallflowGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDCallflowGet

> ServiceDocsCallflowGetAll v1AccountAccountIDCallflowGet(accountID, startKey, pageSize)

Get Callflow List

Permit a user to view the callflow details in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallflowApi;

CallflowApi apiInstance = new CallflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsCallflowGetAll result = apiInstance.v1AccountAccountIDCallflowGet(accountID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallflowApi#v1AccountAccountIDCallflowGet");
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

[**ServiceDocsCallflowGetAll**](ServiceDocsCallflowGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDCallflowPost

> ServiceDocsCallflowGetSingle v1AccountAccountIDCallflowPost(accountID, request)

Create Call Group

Create instructions for routing a call to a user or system.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallflowApi;

CallflowApi apiInstance = new CallflowApi();
String accountID = null; // String | Account ID, 32 alpha-numeric
ServiceCallflowAddEditData request = new ServiceCallflowAddEditData(); // ServiceCallflowAddEditData | Call flow configuration
try {
    ServiceDocsCallflowGetSingle result = apiInstance.v1AccountAccountIDCallflowPost(accountID, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallflowApi#v1AccountAccountIDCallflowPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha-numeric | [default to null]
 **request** | [**ServiceCallflowAddEditData**](ServiceCallflowAddEditData.md)| Call flow configuration |

### Return type

[**ServiceDocsCallflowGetSingle**](ServiceDocsCallflowGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

