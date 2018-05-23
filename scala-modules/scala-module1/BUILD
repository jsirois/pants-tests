scala_library(
    sources=rglobs('src/main/scala/*'),
    dependencies=[
        'project:java-module1'
    ]
)

junit_tests(
    name='tests',
    sources=rglobs('src/test/scala/*'),
    dependencies=[
        ':scala-module1',
        scoped('3rdparty:deps-test', 'test'),
    ]
)
