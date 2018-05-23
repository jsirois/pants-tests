jvm_binary(
    name='java-module2',
    dependencies=[
        'project:java-module1'
    ],
    source='JavaTest2.java',
    main='JavaTest2'
)

jvm_app(
    name='java-module2-app',
    dependencies=[':java-module2']
)