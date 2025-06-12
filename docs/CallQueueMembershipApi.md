# CallQueueMembershipApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDQueuemembershipPost**](CallQueueMembershipApi.md#v1AccountAccountIDQueuemembershipPost) | **POST** /v1/account/{accountID}/queuemembership | Grant Queue Membership to User
[**v1AccountAccountIDQueuemembershipRecipientIDDisablePost**](CallQueueMembershipApi.md#v1AccountAccountIDQueuemembershipRecipientIDDisablePost) | **POST** /v1/account/{accountID}/queuemembership/{recipientID}/disable | Disable Queue Membership
[**v1AccountAccountIDQueuemembershipRecipientIDEnablePost**](CallQueueMembershipApi.md#v1AccountAccountIDQueuemembershipRecipientIDEnablePost) | **POST** /v1/account/{accountID}/queuemembership/{recipientID}/enable | Enable Queue Membership



## v1AccountAccountIDQueuemembershipPost

> ServiceDocsCallQueueMemberGetSingle v1AccountAccountIDQueuemembershipPost(accountID, reqBody)

Grant Queue Membership to User

Allow users to create queue memberships for recipients.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueMembershipApi;

CallQueueMembershipApi apiInstance = new CallQueueMembershipApi();
String accountID = null; // String | Account ID, 32 alpha numeric
ServiceVOIPQueueMembershipAddData reqBody = new ServiceVOIPQueueMembershipAddData(); // ServiceVOIPQueueMembershipAddData | payload fields
try {
    ServiceDocsCallQueueMemberGetSingle result = apiInstance.v1AccountAccountIDQueuemembershipPost(accountID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueMembershipApi#v1AccountAccountIDQueuemembershipPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPQueueMembershipAddData**](ServiceVOIPQueueMembershipAddData.md)| payload fields |

### Return type

[**ServiceDocsCallQueueMemberGetSingle**](ServiceDocsCallQueueMemberGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDQueuemembershipRecipientIDDisablePost

> ServiceAPIResponse v1AccountAccountIDQueuemembershipRecipientIDDisablePost(accountID, recipientID)

Disable Queue Membership

Deactivate queue membership for a recipient.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueMembershipApi;

CallQueueMembershipApi apiInstance = new CallQueueMembershipApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recipientID = null; // String | Recipient ID, 32 alpha numeric
try {
    ServiceAPIResponse result = apiInstance.v1AccountAccountIDQueuemembershipRecipientIDDisablePost(accountID, recipientID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueMembershipApi#v1AccountAccountIDQueuemembershipRecipientIDDisablePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recipientID** | **String**| Recipient ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceAPIResponse**](ServiceAPIResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDQueuemembershipRecipientIDEnablePost

> ServiceAPIResponse v1AccountAccountIDQueuemembershipRecipientIDEnablePost(accountID, recipientID, reqBody)

Enable Queue Membership

Activate queue membership for a recipient.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallQueueMembershipApi;

CallQueueMembershipApi apiInstance = new CallQueueMembershipApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recipientID = null; // String | Recipient ID, 32 alpha numeric
ServiceVOIPCallQueueEnableMembershipData reqBody = new ServiceVOIPCallQueueEnableMembershipData(); // ServiceVOIPCallQueueEnableMembershipData | payload fields
try {
    ServiceAPIResponse result = apiInstance.v1AccountAccountIDQueuemembershipRecipientIDEnablePost(accountID, recipientID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallQueueMembershipApi#v1AccountAccountIDQueuemembershipRecipientIDEnablePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recipientID** | **String**| Recipient ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPCallQueueEnableMembershipData**](ServiceVOIPCallQueueEnableMembershipData.md)| payload fields |

### Return type

[**ServiceAPIResponse**](ServiceAPIResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

