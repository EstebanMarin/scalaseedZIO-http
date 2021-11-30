# Thanks for looking into this!!!! 🙏
I started this project from a clean slate doing a 
````
sbt new scala/scala-seed.g8
````

 and then adding the dependencies to answer your question

 I am getting to the code 

```Scala
  val program                                                    = for {
    res <- Client.request(url, headers)
    _   <- console.putStrLn {
             s"Code= ${res.status.toJHttpStatus.code()}"
           }
  } yield ()
```

 ```shell
[info] compiling 1 Scala source to /Users/marinest/adidas/scala/dev/zio-http-clean-test/target/scala-2.13/classes ...
[info] running example.SimpleClient 
Code= 302
 ```