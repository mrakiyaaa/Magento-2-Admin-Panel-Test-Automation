## Test Scenarios & Test Cases

### 1. Login Page Testing
| Test Case ID | Test Case | Steps | Expected Result |
|-------------|----------|-------|----------------|
| TC_01 | Login with valid credentials | 1. Open Admin Login Page <br> 2. Enter valid username & password <br> 3. Click "Sign In" | User should be redirected to the Dashboard |
| TC_02 | Login with invalid credentials | 1. Enter incorrect username/password <br> 2. Click "Sign In" | Error message should be displayed |
| TC_03 | Login with blank credentials | 1. Leave username & password empty <br> 2. Click "Sign In" | "Required field" error should appear |
| TC_04 | Verify "Forgot Password" functionality | 1. Click on "Forgot Password?" <br> 2. Enter registered email <br> 3. Click Submit | Password reset email should be sent |

### 2. Dashboard Testing
| Test Case ID | Test Case | Steps | Expected Result |
|-------------|----------|-------|----------------|
| TC_05 | Verify Dashboard UI elements | 1. Login as Admin <br> 2. Check if dashboard sections (Sales, Orders, Products) are visible | All dashboard sections should be displayed correctly |
| TC_06 | Verify Logout Functionality | 1. Click on the Admin profile <br> 2. Select "Sign Out" | User should be logged out and redirected to the login page |

### 3. Product Management
| Test Case ID | Test Case | Steps | Expected Result |
|-------------|----------|-------|----------------|
| TC_07 | Add a new product | 1. Navigate to "Catalog" > "Products" <br> 2. Click "Add Product" <br> 3. Fill product details <br> 4. Save | Product should be added successfully |
| TC_08 | Edit an existing product | 1. Navigate to "Products" <br> 2. Select a product <br> 3. Update details & Save | Changes should be saved successfully |
| TC_09 | Delete a product | 1. Navigate to "Products" <br> 2. Select & delete a product | Product should be removed |

### 4. Order Management
| Test Case ID | Test Case | Steps | Expected Result |
|-------------|----------|-------|----------------|
| TC_10 | View order details | 1. Navigate to "Sales" > "Orders" <br> 2. Click on an order | Order details should be displayed |
| TC_11 | Update order status | 1. Open an order <br> 2. Change status (e.g., Pending to Complete) <br> 3. Save | Status should be updated |
| TC_12 | Cancel an order | 1. Open an order <br> 2. Click "Cancel" | Order should be canceled |

### 5. User Roles & Permissions
| Test Case ID | Test Case | Steps | Expected Result |
|-------------|----------|-------|----------------|
| TC_13 | Create a new admin user | 1. Go to "System" > "Permissions" > "All Users" <br> 2. Click "Add New User" <br> 3. Fill details & assign role <br> 4. Save | New admin user should be created |
| TC_14 | Verify role-based access | 1. Login with a restricted role user <br> 2. Try accessing admin settings | Restricted user should not have access |

