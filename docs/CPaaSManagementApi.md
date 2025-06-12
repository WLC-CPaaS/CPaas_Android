# CPaaSManagementApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1MgmtUserGet**](CPaaSManagementApi.md#v1MgmtUserGet) | **GET** /v1/mgmt/user | Get All CPaaS Users
[**v1MgmtUserPost**](CPaaSManagementApi.md#v1MgmtUserPost) | **POST** /v1/mgmt/user | Invite CPaaS User
[**v1MgmtUserUserIDDelete**](CPaaSManagementApi.md#v1MgmtUserUserIDDelete) | **DELETE** /v1/mgmt/user/{userID} | Delete CPaaS User
[**v1MgmtUserUserIDGet**](CPaaSManagementApi.md#v1MgmtUserUserIDGet) | **GET** /v1/mgmt/user/{userID} | Get CPaaS User Details
[**v1MgmtUserUserIDPut**](CPaaSManagementApi.md#v1MgmtUserUserIDPut) | **PUT** /v1/mgmt/user/{userID} | Update CPaaS User Role



## v1MgmtUserGet

> ServiceDocsAdminUserGetAll v1MgmtUserGet(pageSize, startKey, sort, email, role, firstName, lastName)

Get All CPaaS Users

Retrieve a list of all CPaaS users in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CPaaSManagementApi;

CPaaSManagementApi apiInstance = new CPaaSManagementApi();
Integer pageSize = null; // Integer | number of records to return, range 1 to 100
String startKey = null; // String | unique to fetch next records
String sort = null; // String | sorting the records by email(default)/role/first_name/last_name, _A is for ascending and _D is for descending, eg: sort=role_A,email_D
String email = null; // String | Email
String role = null; // String | User Role
String firstName = null; // String | First Name
String lastName = null; // String | Last Name
try {
    ServiceDocsAdminUserGetAll result = apiInstance.v1MgmtUserGet(pageSize, startKey, sort, email, role, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CPaaSManagementApi#v1MgmtUserGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| number of records to return, range 1 to 100 | [optional] [default to null]
 **startKey** | **String**| unique to fetch next records | [optional] [default to null]
 **sort** | **String**| sorting the records by email(default)/role/first_name/last_name, _A is for ascending and _D is for descending, eg: sort&#x3D;role_A,email_D | [optional] [default to null]
 **email** | **String**| Email | [optional] [default to null]
 **role** | **String**| User Role | [optional] [default to null]
 **firstName** | **String**| First Name | [optional] [default to null]
 **lastName** | **String**| Last Name | [optional] [default to null]

### Return type

[**ServiceDocsAdminUserGetAll**](ServiceDocsAdminUserGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1MgmtUserPost

> ServiceDocsAdminUserGetSingle v1MgmtUserPost(reqBody)

Invite CPaaS User

Link a new CPaaS user to an existing client account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CPaaSManagementApi;

CPaaSManagementApi apiInstance = new CPaaSManagementApi();
ServiceAdminUserAddData reqBody = new ServiceAdminUserAddData(); // ServiceAdminUserAddData | payload fields
try {
    ServiceDocsAdminUserGetSingle result = apiInstance.v1MgmtUserPost(reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CPaaSManagementApi#v1MgmtUserPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqBody** | [**ServiceAdminUserAddData**](ServiceAdminUserAddData.md)| payload fields |

### Return type

[**ServiceDocsAdminUserGetSingle**](ServiceDocsAdminUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1MgmtUserUserIDDelete

> ServiceDocsAdminUserDelete v1MgmtUserUserIDDelete(userID)

Delete CPaaS User

Delete a CPaaS user from the associated account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CPaaSManagementApi;

CPaaSManagementApi apiInstance = new CPaaSManagementApi();
String userID = null; // String | User ID, numeric
try {
    ServiceDocsAdminUserDelete result = apiInstance.v1MgmtUserUserIDDelete(userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CPaaSManagementApi#v1MgmtUserUserIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **String**| User ID, numeric | [default to null]

### Return type

[**ServiceDocsAdminUserDelete**](ServiceDocsAdminUserDelete.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1MgmtUserUserIDGet

> ServiceDocsAdminUserGetSingle v1MgmtUserUserIDGet(userID)

Get CPaaS User Details

View details about each CPaaS user in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CPaaSManagementApi;

CPaaSManagementApi apiInstance = new CPaaSManagementApi();
String userID = null; // String | User ID, numeric
try {
    ServiceDocsAdminUserGetSingle result = apiInstance.v1MgmtUserUserIDGet(userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CPaaSManagementApi#v1MgmtUserUserIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **String**| User ID, numeric | [default to null]

### Return type

[**ServiceDocsAdminUserGetSingle**](ServiceDocsAdminUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## v1MgmtUserUserIDPut

> ServiceDocsAdminUserGetSingle v1MgmtUserUserIDPut(userID, reqBody)

Update CPaaS User Role

Update a CPaaS user&#39;s role within a client&#39;s account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CPaaSManagementApi;

CPaaSManagementApi apiInstance = new CPaaSManagementApi();
String userID = null; // String | User ID, numeric
ServiceAdminUserEditData reqBody = new ServiceAdminUserEditData(); // ServiceAdminUserEditData | payload fields
try {
    ServiceDocsAdminUserGetSingle result = apiInstance.v1MgmtUserUserIDPut(userID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CPaaSManagementApi#v1MgmtUserUserIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **String**| User ID, numeric | [default to null]
 **reqBody** | [**ServiceAdminUserEditData**](ServiceAdminUserEditData.md)| payload fields |

### Return type

[**ServiceDocsAdminUserGetSingle**](ServiceDocsAdminUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

