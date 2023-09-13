openapi-generator-cli generate \
     -g spring \
     --library spring-boot \
     -i api.yaml \
     -o "${PWD}" \
     -p groupId=sk.filiptvrdon \
     -p artifactId=todo \
     -p artifactVersion=1.0.0-SNAPSHOT \
     \
     -p basePackage=sk.filiptvrdon.todo \
     -p configPackage=sk.filiptvrdon.todo.config \
     -p apiPackage=sk.filiptvrdon.todo.api \
     -p modelPackage=sk.filiptvrdon.todo.model \
     \
     -p sourceFolder=src/main/gen \
     \
     -p dateLibrary=java17 \
     -p java17=true
