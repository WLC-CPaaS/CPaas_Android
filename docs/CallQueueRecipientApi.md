# CallQueueRecipientApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDLoginrecipientRecipientIDPost**](CallQueueRecipientApi.md#v1AccountAccountIDLoginrecipientRecipientIDPost) | **POST** /v1/account/{accountID}/loginrecipient/{recipientID} | Login as Recipient
[**v1AccountAccountIDQueuerecipientGet**](CallQueueRecipientApi.md#v1AccountAccountIDQueuerecipientGet) | **GET** /v1/account/{accountID}/queuerecipient | Change Recipient Status
[**v1AccountAccountIDRecipientRecipientIDStatusPost**](CallQueueRecipientApi.md#v1AccountAccountIDRecipientRecipientIDStatusPost) | **POST** /v1/account/{accountID}/recipient/{recipientID}/status | Get Recipient List



## v1AccountAccountIDLoginrecipientRecipientIDPost

> ServiceDocsCallQueueRecipientLoginLogoutOutput v1AccountAccountIDLoginrecipientRecipientIDPost(accountID, recipientID, reqBody)

Login as Recipient

Agents must log in to receive calls. Depending on their membership, they can log in to one or more queues. (If an agent is a member of more than one queue, they will receive calls from all the queues they are a part of.)

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueRecipientApi;

CallQueueRecipientApi apiInstance = new CallQueueRecipientApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recipientID = null; // String | Recipient ID, 32 alpha numeric
ServiceVOIPCallQueueRecipientLoginLogoutData reqBody = new ServiceVOIPCallQueueRecipientLoginLogoutData(); // ServiceVOIPCallQueueRecipientLoginLogoutData | payload fields
try {
    ServiceDocsCallQueueRecipientLoginLogoutOutput result = apiInstance.v1AccountAccountIDLoginrecipientRecipientIDPost(accountID, recipientID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueRecipientApi#v1AccountAccountIDLoginrecipientRecipientIDPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recipientID** | **String**| Recipient ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPCallQueueRecipientLoginLogoutData**](ServiceVOIPCallQueueRecipientLoginLogoutData.md)| payload fields |

### Return type

[**ServiceDocsCallQueueRecipientLoginLogoutOutput**](ServiceDocsCallQueueRecipientLoginLogoutOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDQueuerecipientGet

> ServiceDocsGetQueueRecipients v1AccountAccountIDQueuerecipientGet(accountID)

Change Recipient Status

Get a list of all recipients in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueRecipientApi;

CallQueueRecipientApi apiInstance = new CallQueueRecipientApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsGetQueueRecipients result = apiInstance.v1AccountAccountIDQueuerecipientGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueRecipientApi#v1AccountAccountIDQueuerecipientGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsGetQueueRecipients**](ServiceDocsGetQueueRecipients.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDRecipientRecipientIDStatusPost

> ServiceAPIResponse v1AccountAccountIDRecipientRecipientIDStatusPost(accountID, recipientID, reqBody)

Get Recipient List

Change the status of a recipient to ready, away, etc.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueRecipientApi;

CallQueueRecipientApi apiInstance = new CallQueueRecipientApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recipientID = null; // String | Recipient ID, 32 alpha numeric
ServiceVOIPCallQueueRecipientStatusData reqBody = new ServiceVOIPCallQueueRecipientStatusData(); // ServiceVOIPCallQueueRecipientStatusData | payload fields
try {
    ServiceAPIResponse result = apiInstance.v1AccountAccountIDRecipientRecipientIDStatusPost(accountID, recipientID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueRecipientApi#v1AccountAccountIDRecipientRecipientIDStatusPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recipientID** | **String**| Recipient ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPCallQueueRecipientStatusData**](ServiceVOIPCallQueueRecipientStatusData.md)| payload fields |

### Return type

[**ServiceAPIResponse**](ServiceAPIResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

