# DataApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDCdrCdrIDGet**](DataApi.md#v1AccountAccountIDCdrCdrIDGet) | **GET** /v1/account/{accountID}/cdr/{cdrID} | Get CDR Details
[**v1AccountAccountIDCdrGet**](DataApi.md#v1AccountAccountIDCdrGet) | **GET** /v1/account/{accountID}/cdr | Get CDR List
[**v1DataCallDailySummaryGet**](DataApi.md#v1DataCallDailySummaryGet) | **GET** /v1/data/call_daily_summary | Get Call Daily Summary List
[**v1DataCallDetailGet**](DataApi.md#v1DataCallDetailGet) | **GET** /v1/data/call_detail | Get Call Detail List
[**v1DataCallMonthlySummaryGet**](DataApi.md#v1DataCallMonthlySummaryGet) | **GET** /v1/data/call_monthly_summary | Get Call Detail List
[**v1DataEndpointListGet**](DataApi.md#v1DataEndpointListGet) | **GET** /v1/data/endpoint_list | Get Endpoint List
[**v1DataEventDailySummaryGet**](DataApi.md#v1DataEventDailySummaryGet) | **GET** /v1/data/event_daily_summary | Get Event Daily Summary List
[**v1DataEventDetailGet**](DataApi.md#v1DataEventDetailGet) | **GET** /v1/data/event_detail | Get Event Details
[**v1DataEventMonthlySummaryGet**](DataApi.md#v1DataEventMonthlySummaryGet) | **GET** /v1/data/event_monthly_summary | Get Event Monthly Summary List
[**v1DataFeatureDailySummaryGet**](DataApi.md#v1DataFeatureDailySummaryGet) | **GET** /v1/data/feature_daily_summary | Get Feature Daily Summary List
[**v1DataFeatureMonthlySummaryGet**](DataApi.md#v1DataFeatureMonthlySummaryGet) | **GET** /v1/data/feature_monthly_summary | Get Feature Monthly Summary List



## v1AccountAccountIDCdrCdrIDGet

> ServiceDocsCdrGetSingle v1AccountAccountIDCdrCdrIDGet(accountID, cdrID)

Get CDR Details

Retrieve the details of a single CDR record from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String cdrID = null; // String | CDR ID, string
try {
    ServiceDocsCdrGetSingle result = apiInstance.v1AccountAccountIDCdrCdrIDGet(accountID, cdrID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1AccountAccountIDCdrCdrIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **cdrID** | **String**| CDR ID, string | [default to null]

### Return type

[**ServiceDocsCdrGetSingle**](ServiceDocsCdrGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDCdrGet

> ServiceDocsCdrGetAll v1AccountAccountIDCdrGet(accountID, pageSize, startKey, createdFrom, createdTo)

Get CDR List

Retrieve a list of CDRs in a specific account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String pageSize = null; // String | Page size (Maximum number of results to display per page)
String startKey = null; // String | Start key (Starting offset for displaying results)
String createdFrom = null; // String | For displaying records which are created on or after this timestamp (Supported timestamp formats: iso 8601, unix time in seconds or milliseconds or microseconds or nanoseconds)
String createdTo = null; // String | For displaying records which are created on or before this timestamp (Supported timestamp formats: iso 8601, unix time in seconds or milliseconds or microseconds or nanoseconds)
try {
    ServiceDocsCdrGetAll result = apiInstance.v1AccountAccountIDCdrGet(accountID, pageSize, startKey, createdFrom, createdTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1AccountAccountIDCdrGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **pageSize** | **String**| Page size (Maximum number of results to display per page) | [optional] [default to null]
 **startKey** | **String**| Start key (Starting offset for displaying results) | [optional] [default to null]
 **createdFrom** | **String**| For displaying records which are created on or after this timestamp (Supported timestamp formats: iso 8601, unix time in seconds or milliseconds or microseconds or nanoseconds) | [optional] [default to null]
 **createdTo** | **String**| For displaying records which are created on or before this timestamp (Supported timestamp formats: iso 8601, unix time in seconds or milliseconds or microseconds or nanoseconds) | [optional] [default to null]

### Return type

[**ServiceDocsCdrGetAll**](ServiceDocsCdrGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1DataCallDailySummaryGet

> ServiceDocsCallDailySummary v1DataCallDailySummaryGet(accountId, callType, endDate, pageSize, startDate, startKey)

Get Call Daily Summary List

Retrieve a daily summary of calls, including the account ID that made or received a call, the call type, the month and year, the duration, and other relevant information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountId = null; // String | 
String callType = null; // String | 
String endDate = null; // String | 
Integer pageSize = null; // Integer | 
String startDate = null; // String | 
String startKey = null; // String | 
try {
    ServiceDocsCallDailySummary result = apiInstance.v1DataCallDailySummaryGet(accountId, callType, endDate, pageSize, startDate, startKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataCallDailySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  | [optional] [default to null]
 **callType** | **String**|  | [optional] [default to null]
 **endDate** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startDate** | **String**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsCallDailySummary**](ServiceDocsCallDailySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataCallDetailGet

> ServiceDocsCallDetail v1DataCallDetailGet(account, callType, calleeName, calleeNumber, callerName, callerNumber, endDate, pageSize, startDate, startKey)

Get Call Detail List

Retrieve specific details about a call (e.g., caller, recipient, date, time, duration, etc.).

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String account = null; // String | 
String callType = null; // String | 
String calleeName = null; // String | 
String calleeNumber = null; // String | 
String callerName = null; // String | 
String callerNumber = null; // String | 
String endDate = null; // String | 
Integer pageSize = null; // Integer | 
String startDate = null; // String | 
String startKey = null; // String | 
try {
    ServiceDocsCallDetail result = apiInstance.v1DataCallDetailGet(account, callType, calleeName, calleeNumber, callerName, callerNumber, endDate, pageSize, startDate, startKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataCallDetailGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**|  | [optional] [default to null]
 **callType** | **String**|  | [optional] [default to null]
 **calleeName** | **String**|  | [optional] [default to null]
 **calleeNumber** | **String**|  | [optional] [default to null]
 **callerName** | **String**|  | [optional] [default to null]
 **callerNumber** | **String**|  | [optional] [default to null]
 **endDate** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startDate** | **String**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsCallDetail**](ServiceDocsCallDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataCallMonthlySummaryGet

> ServiceDocsCallMonthlySummary v1DataCallMonthlySummaryGet(account, callType, endMonth, endYear, pageSize, startKey, startMonth, startYear)

Get Call Detail List

Retrieve a monthly summary of calls, including which accounts made or received calls, the call type, and other relevant information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String account = null; // String | 
String callType = null; // String | 
Integer endMonth = null; // Integer | 
Integer endYear = null; // Integer | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
Integer startMonth = null; // Integer | 
Integer startYear = null; // Integer | 
try {
    ServiceDocsCallMonthlySummary result = apiInstance.v1DataCallMonthlySummaryGet(account, callType, endMonth, endYear, pageSize, startKey, startMonth, startYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataCallMonthlySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **String**|  | [optional] [default to null]
 **callType** | **String**|  | [optional] [default to null]
 **endMonth** | **Integer**|  | [optional] [default to null]
 **endYear** | **Integer**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **startMonth** | **Integer**|  | [optional] [default to null]
 **startYear** | **Integer**|  | [optional] [default to null]

### Return type

[**ServiceDocsCallMonthlySummary**](ServiceDocsCallMonthlySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataEndpointListGet

> ServiceDocsEndpointList v1DataEndpointListGet(endpointName, featureName, pageSize, startKey, transactionType, version)

Get Endpoint List

Access the endpoint list for each CPaaS API.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String endpointName = null; // String | 
String featureName = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
String transactionType = null; // String | 
String version = null; // String | 
try {
    ServiceDocsEndpointList result = apiInstance.v1DataEndpointListGet(endpointName, featureName, pageSize, startKey, transactionType, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataEndpointListGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointName** | **String**|  | [optional] [default to null]
 **featureName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **transactionType** | **String**|  | [optional] [default to null]
 **version** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsEndpointList**](ServiceDocsEndpointList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataEventDailySummaryGet

> ServiceDocsEventDailySummary v1DataEventDailySummaryGet(accountId, component, endDate, pageSize, startDate, startKey)

Get Event Daily Summary List

Obtain a daily summary of events in a CPaaS account (e.g., setting/resetting the presence status for a user or extension).

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountId = null; // String | 
String component = null; // String | 
String endDate = null; // String | 
Integer pageSize = null; // Integer | 
String startDate = null; // String | 
String startKey = null; // String | 
try {
    ServiceDocsEventDailySummary result = apiInstance.v1DataEventDailySummaryGet(accountId, component, endDate, pageSize, startDate, startKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataEventDailySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  | [optional] [default to null]
 **component** | **String**|  | [optional] [default to null]
 **endDate** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startDate** | **String**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsEventDailySummary**](ServiceDocsEventDailySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataEventDetailGet

> ServiceDocsEventDetail v1DataEventDetailGet(accountId, component, endDateTime, eventName, execStatus, pageSize, startDateTime, startKey, username)

Get Event Details

Obtain specific details about an event (e.g., an E911 notification, a deleted account, or a created user).

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountId = null; // String | 
String component = null; // String | 
String endDateTime = null; // String | 
String eventName = null; // String | 
String execStatus = null; // String | 
Integer pageSize = null; // Integer | 
String startDateTime = null; // String | 
String startKey = null; // String | 
String username = null; // String | 
try {
    ServiceDocsEventDetail result = apiInstance.v1DataEventDetailGet(accountId, component, endDateTime, eventName, execStatus, pageSize, startDateTime, startKey, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataEventDetailGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  | [optional] [default to null]
 **component** | **String**|  | [optional] [default to null]
 **endDateTime** | **String**|  | [optional] [default to null]
 **eventName** | **String**|  | [optional] [default to null]
 **execStatus** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startDateTime** | **String**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **username** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsEventDetail**](ServiceDocsEventDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataEventMonthlySummaryGet

> ServiceDocsEventMonthlySummary v1DataEventMonthlySummaryGet(accountId, component, endMonth, endYear, pageSize, startKey, startMonth, startYear)

Get Event Monthly Summary List

Obtain a monthly summary of events in a CPaaS account (e.g., adding media files or assigning phone numbers).

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String accountId = null; // String | 
String component = null; // String | 
Integer endMonth = null; // Integer | 
Integer endYear = null; // Integer | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
Integer startMonth = null; // Integer | 
Integer startYear = null; // Integer | 
try {
    ServiceDocsEventMonthlySummary result = apiInstance.v1DataEventMonthlySummaryGet(accountId, component, endMonth, endYear, pageSize, startKey, startMonth, startYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataEventMonthlySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**|  | [optional] [default to null]
 **component** | **String**|  | [optional] [default to null]
 **endMonth** | **Integer**|  | [optional] [default to null]
 **endYear** | **Integer**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **startMonth** | **Integer**|  | [optional] [default to null]
 **startYear** | **Integer**|  | [optional] [default to null]

### Return type

[**ServiceDocsEventMonthlySummary**](ServiceDocsEventMonthlySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataFeatureDailySummaryGet

> ServiceDocsFeatureDailySummary v1DataFeatureDailySummaryGet(endDate, featureName, pageSize, startDate, startKey)

Get Feature Daily Summary List

Retrieve a daily summary about a feature, including usage, which accounts execute the steps, and other relevant information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
String endDate = null; // String | 
String featureName = null; // String | 
Integer pageSize = null; // Integer | 
String startDate = null; // String | 
String startKey = null; // String | 
try {
    ServiceDocsFeatureDailySummary result = apiInstance.v1DataFeatureDailySummaryGet(endDate, featureName, pageSize, startDate, startKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataFeatureDailySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endDate** | **String**|  | [optional] [default to null]
 **featureName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startDate** | **String**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]

### Return type

[**ServiceDocsFeatureDailySummary**](ServiceDocsFeatureDailySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1DataFeatureMonthlySummaryGet

> ServiceDocsFeatureMonthlySummary v1DataFeatureMonthlySummaryGet(endMonth, endYear, featureName, pageSize, startKey, startMonth, startYear)

Get Feature Monthly Summary List

Retrieve a monthly summary about a feature’s usage, new users, updates, and other relevant information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DataApi;

DataApi apiInstance = new DataApi();
Integer endMonth = null; // Integer | 
Integer endYear = null; // Integer | 
String featureName = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
Integer startMonth = null; // Integer | 
Integer startYear = null; // Integer | 
try {
    ServiceDocsFeatureMonthlySummary result = apiInstance.v1DataFeatureMonthlySummaryGet(endMonth, endYear, featureName, pageSize, startKey, startMonth, startYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataApi#v1DataFeatureMonthlySummaryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endMonth** | **Integer**|  | [optional] [default to null]
 **endYear** | **Integer**|  | [optional] [default to null]
 **featureName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **startMonth** | **Integer**|  | [optional] [default to null]
 **startYear** | **Integer**|  | [optional] [default to null]

### Return type

[**ServiceDocsFeatureMonthlySummary**](ServiceDocsFeatureMonthlySummary.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

