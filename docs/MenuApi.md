# MenuApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDMenuGet**](MenuApi.md#v1AccountAccountIDMenuGet) | **GET** /v1/account/{accountID}/menu | Get Menu List
[**v1AccountAccountIDMenuMenuIDDelete**](MenuApi.md#v1AccountAccountIDMenuMenuIDDelete) | **DELETE** /v1/account/{accountID}/menu/{menuID} | Delete Menu
[**v1AccountAccountIDMenuMenuIDGet**](MenuApi.md#v1AccountAccountIDMenuMenuIDGet) | **GET** /v1/account/{accountID}/menu/{menuID} | Get Menu Details
[**v1AccountAccountIDMenuMenuIDPut**](MenuApi.md#v1AccountAccountIDMenuMenuIDPut) | **PUT** /v1/account/{accountID}/menu/{menuID} | Update Menu
[**v1AccountAccountIDMenuPost**](MenuApi.md#v1AccountAccountIDMenuPost) | **POST** /v1/account/{accountID}/menu | Create Menu



## v1AccountAccountIDMenuGet

> MenuOutputList v1AccountAccountIDMenuGet(accountID, startKey, pageSize)

Get Menu List

Users can access data about all menus in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    MenuOutputList result = apiInstance.v1AccountAccountIDMenuGet(accountID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#v1AccountAccountIDMenuGet");
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

[**MenuOutputList**](MenuOutputList.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDMenuMenuIDDelete

> MenuOutputDetail v1AccountAccountIDMenuMenuIDDelete(accountID, menuID)

Delete Menu

Delete a menu from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String menuID = null; // String | Menu ID, 32 alpha numeric
try {
    MenuOutputDetail result = apiInstance.v1AccountAccountIDMenuMenuIDDelete(accountID, menuID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#v1AccountAccountIDMenuMenuIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **menuID** | **String**| Menu ID, 32 alpha numeric | [default to null]

### Return type

[**MenuOutputDetail**](MenuOutputDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDMenuMenuIDGet

> MenuOutputDetail v1AccountAccountIDMenuMenuIDGet(accountID, menuID)

Get Menu Details

Get details about a menu in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String menuID = null; // String | Menu ID, 32 alpha numeric
try {
    MenuOutputDetail result = apiInstance.v1AccountAccountIDMenuMenuIDGet(accountID, menuID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#v1AccountAccountIDMenuMenuIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **menuID** | **String**| Menu ID, 32 alpha numeric | [default to null]

### Return type

[**MenuOutputDetail**](MenuOutputDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDMenuMenuIDPut

> MenuOutputDetail v1AccountAccountIDMenuMenuIDPut(accountID, menuID, reqBody)

Update Menu

Edit an account menu.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String menuID = null; // String | Menu ID, 32 alpha numeric
MenuInputData reqBody = new MenuInputData(); // MenuInputData | payload fields
try {
    MenuOutputDetail result = apiInstance.v1AccountAccountIDMenuMenuIDPut(accountID, menuID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#v1AccountAccountIDMenuMenuIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **menuID** | **String**| Menu ID, 32 alpha numeric | [default to null]
 **reqBody** | [**MenuInputData**](MenuInputData.md)| payload fields |

### Return type

[**MenuOutputDetail**](MenuOutputDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDMenuPost

> MenuOutputDetail v1AccountAccountIDMenuPost(accountID, menu)

Create Menu

Create a new menu for an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MenuApi;

MenuApi apiInstance = new MenuApi();
String accountID = null; // String | Account ID, 32 alphanumeric
MenuInputData menu = new MenuInputData(); // MenuInputData | Menu data
try {
    MenuOutputDetail result = apiInstance.v1AccountAccountIDMenuPost(accountID, menu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#v1AccountAccountIDMenuPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alphanumeric | [default to null]
 **menu** | [**MenuInputData**](MenuInputData.md)| Menu data |

### Return type

[**MenuOutputDetail**](MenuOutputDetail.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

