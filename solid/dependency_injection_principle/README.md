# Dependency Injection Principle - DIP

* Dependency Injection
* Dependency Inversion - i.e. Spring IOC Container from the Spring Framework.

## High-level modules should not depend on low-level modules. Both should depend on abstractions.
## Abstractions should not depend on details. Details should depend on abstractions.

### Violations associated with not following the Dependency Injection Principle.

1. We create a Product Catalog software that have the following Components
  *  SQLProductRepository Class
  *  ProductCatalog Class

2. The violation is based on the design flaw, where ProductCatalog depends directly on the SQLProductRepository class.

### Step for following the Dependency Injection Principle

1. We create an Interface named ProductRepository.
2. Then the SQLProductRepository will implement the ProductRepository interface.
3. Next, we create Factory Class that contains a method that will instantiate a new SQLProductRepository object.
4. Within the ProductCatalog component we call the 'create' method, instantiate the SQLProductRepository and call the 'getAllProductNames' method to display product names.
