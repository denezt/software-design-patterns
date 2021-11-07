# Interface Segregation Principle - ISP

## No Client should be forced to depend on methods it does not use.

### Techniques to identify violations of ISP

1. Fat Interfaces
2. Interfaces with low cohesion.
3. Empty method implementations.

### The Fat Interface will contain methods that are unable to implement in some components.

* An example is IMultiFunction interface

``` java
public void print();

public void getPrintSpoolDetails();

public void scan();

public void scanPhoto();

public void fax();

public void internetFax();
```

A. We can break/segregate these methods into separate interfaces.
  * IPrint Interface

``` java
public void print();

public void getPrintSpoolDetails();
```

  * IScan Interface

``` java
public void scan();

public void scanPhoto();
```

  * IFax Interface

``` java
public void fax();

public void internetFax();
```
