# TemporalRuleApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDTemporalruleGet**](TemporalRuleApi.md#v1AccountAccountIDTemporalruleGet) | **GET** /v1/account/{accountID}/temporalrule | Get Temporal Rule List
[**v1AccountAccountIDTemporalrulePost**](TemporalRuleApi.md#v1AccountAccountIDTemporalrulePost) | **POST** /v1/account/{accountID}/temporalrule | Create Temporal Rule
[**v1AccountAccountIDTemporalruleTemporalRuleIDDelete**](TemporalRuleApi.md#v1AccountAccountIDTemporalruleTemporalRuleIDDelete) | **DELETE** /v1/account/{accountID}/temporalrule/{temporalRuleID} | Delete Temporal Rule
[**v1AccountAccountIDTemporalruleTemporalRuleIDGet**](TemporalRuleApi.md#v1AccountAccountIDTemporalruleTemporalRuleIDGet) | **GET** /v1/account/{accountID}/temporalrule/{temporalRuleID} | Get Temporal Rule Details
[**v1AccountAccountIDTemporalruleTemporalRuleIDPut**](TemporalRuleApi.md#v1AccountAccountIDTemporalruleTemporalRuleIDPut) | **PUT** /v1/account/{accountID}/temporalrule/{temporalRuleID} | Update Temporal Rule



## v1AccountAccountIDTemporalruleGet

> ServiceDocsTemporalRuleGetAll v1AccountAccountIDTemporalruleGet(accountID, startKey, pageSize)

Get Temporal Rule List

Access all temporal rules for an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TemporalRuleApi;

TemporalRuleApi apiInstance = new TemporalRuleApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsTemporalRuleGetAll result = apiInstance.v1AccountAccountIDTemporalruleGet(accountID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemporalRuleApi#v1AccountAccountIDTemporalruleGet");
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

[**ServiceDocsTemporalRuleGetAll**](ServiceDocsTemporalRuleGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDTemporalrulePost

> ServiceDocsTemporalRuleGetSingle v1AccountAccountIDTemporalrulePost(accountID, temporalrule)

Create Temporal Rule

Create temporal rules for an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TemporalRuleApi;

TemporalRuleApi apiInstance = new TemporalRuleApi();
String accountID = null; // String | Account ID, 32 alphanumeric
ServiceVOIPTemporalRuleAddEdit2 temporalrule = new ServiceVOIPTemporalRuleAddEdit2(); // ServiceVOIPTemporalRuleAddEdit2 | payload fields
try {
    ServiceDocsTemporalRuleGetSingle result = apiInstance.v1AccountAccountIDTemporalrulePost(accountID, temporalrule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemporalRuleApi#v1AccountAccountIDTemporalrulePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alphanumeric | [default to null]
 **temporalrule** | [**ServiceVOIPTemporalRuleAddEdit2**](ServiceVOIPTemporalRuleAddEdit2.md)| payload fields |

### Return type

[**ServiceDocsTemporalRuleGetSingle**](ServiceDocsTemporalRuleGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDTemporalruleTemporalRuleIDDelete

> ServiceDocsTemporalRuleGetSingle v1AccountAccountIDTemporalruleTemporalRuleIDDelete(accountID, temporalRuleID)

Delete Temporal Rule

Remove a temporal rule from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TemporalRuleApi;

TemporalRuleApi apiInstance = new TemporalRuleApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String temporalRuleID = null; // String | temporal rule ID, 32 alpha numeric
try {
    ServiceDocsTemporalRuleGetSingle result = apiInstance.v1AccountAccountIDTemporalruleTemporalRuleIDDelete(accountID, temporalRuleID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemporalRuleApi#v1AccountAccountIDTemporalruleTemporalRuleIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **temporalRuleID** | **String**| temporal rule ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsTemporalRuleGetSingle**](ServiceDocsTemporalRuleGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDTemporalruleTemporalRuleIDGet

> ServiceDocsTemporalRuleGetSingle v1AccountAccountIDTemporalruleTemporalRuleIDGet(accountID, temporalRuleID)

Get Temporal Rule Details

View details about individual time rules.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TemporalRuleApi;

TemporalRuleApi apiInstance = new TemporalRuleApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String temporalRuleID = null; // String | Temporal Rule ID, 32 alpha numeric
try {
    ServiceDocsTemporalRuleGetSingle result = apiInstance.v1AccountAccountIDTemporalruleTemporalRuleIDGet(accountID, temporalRuleID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemporalRuleApi#v1AccountAccountIDTemporalruleTemporalRuleIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **temporalRuleID** | **String**| Temporal Rule ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsTemporalRuleGetSingle**](ServiceDocsTemporalRuleGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDTemporalruleTemporalRuleIDPut

> ServiceDocsTemporalRuleGetSingle v1AccountAccountIDTemporalruleTemporalRuleIDPut(accountID, temporalRuleID, reqBody)

Update Temporal Rule

Edit the existing temporal rules in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.TemporalRuleApi;

TemporalRuleApi apiInstance = new TemporalRuleApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String temporalRuleID = null; // String | Temporal Rule ID, 32 alpha numeric
ServiceVOIPTemporalRuleAddEdit2 reqBody = new ServiceVOIPTemporalRuleAddEdit2(); // ServiceVOIPTemporalRuleAddEdit2 | payload fields
try {
    ServiceDocsTemporalRuleGetSingle result = apiInstance.v1AccountAccountIDTemporalruleTemporalRuleIDPut(accountID, temporalRuleID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemporalRuleApi#v1AccountAccountIDTemporalruleTemporalRuleIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **temporalRuleID** | **String**| Temporal Rule ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPTemporalRuleAddEdit2**](ServiceVOIPTemporalRuleAddEdit2.md)| payload fields |

### Return type

[**ServiceDocsTemporalRuleGetSingle**](ServiceDocsTemporalRuleGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

