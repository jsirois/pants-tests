casbah = scala_jar('org.mongodb', 'casbah', '3.1.1')

jar_library(
    name = 'scala-module2-deps',
    jars = [casbah]
)

scala_library(
    sources = rglobs('*.scala'),
    dependencies = [
        'scala-modules/scala-module1', ':scala-module2-deps'
    ]
)