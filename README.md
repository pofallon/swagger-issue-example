# swagger-issue-example

To see the error, clone the repo and run `mvn clean compile exec:java`

You'll get an error similar to the following:
```
java.lang.reflect.InvocationTargetException
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:497)
        at org.codehaus.mojo.exec.ExecJavaMojo$1.run(ExecJavaMojo.java:297)
        at java.lang.Thread.run(Thread.java:745)
Caused by: java.lang.NullPointerException
        at io.swagger.jackson.ModelResolver.handleUnwrapped(ModelResolver.java:608)
        at io.swagger.jackson.ModelResolver.resolve(ModelResolver.java:441)
        at io.swagger.jackson.ModelResolver.resolve(ModelResolver.java:183)
        at io.swagger.converter.ModelConverterContextImpl.resolve(ModelConverterContextImpl.java:100)
        at io.swagger.jackson.ModelResolver.resolve(ModelResolver.java:234)
        at io.swagger.jackson.ModelResolver.resolve(ModelResolver.java:183)
        at io.swagger.converter.ModelConverterContextImpl.resolve(ModelConverterContextImpl.java:100)
        at io.swagger.jackson.ModelResolver.resolveProperty(ModelResolver.java:159)
        at io.swagger.jackson.ModelResolver.resolveProperty(ModelResolver.java:110)
        at io.swagger.converter.ModelConverterContextImpl.resolveProperty(ModelConverterContextImpl.java:80)
        at io.swagger.converter.ModelConverters.readAsProperty(ModelConverters.java:58)
        at io.swagger.jaxrs.Reader.parseMethod(Reader.java:896)
        at io.swagger.jaxrs.Reader.read(Reader.java:322)
        at io.swagger.jaxrs.Reader.read(Reader.java:172)
        at io.swagger.jaxrs.config.BeanConfig.scanAndRead(BeanConfig.java:242)
        at io.swagger.jaxrs.config.BeanConfig.setScan(BeanConfig.java:221)
        at com.example.Main.startServer(Main.java:31)
        at com.example.Main.main(Main.java:37)
        ... 6 more
```

Any of these will fix it, but they alter the intended function of the API:
* Comment the `@Api` annotation in MyResource.java (but you'll lose the Swagger JSON)
* Comment the `@JsonIgnore` annotation from Identifiable.java (but the id will appear in the JSON response)
* Remove the Wrapper<> and just return a Doodad from the resource (but you'll lose the 'extras' property)
