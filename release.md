To make a release:

- optionally regenerate using `java -jar swagger-codegen-cli-2.4.9.jar generate -i http://localhost:8090/api-docs/def -l java -o /workspace/sentineldb-java-client --invoker-package com.logsentinel.sentineldb --model-package com.logsentinel.sentineldb.model --api-package com.logsentinel.sentineldb.api --http-user-agent SentinelDB-Java-Client --group-id com.logsentinel.sentineldb --artifact-id sentineldb-java-client --config swagger-codegen.json`
- change the current SNAPSHOT version to a non-snapshot one (remove -SNAPSHOT)
- run `mvn clean deploy -Dgpg.passphrase=<..>`

(you need the proper gpg keys for the OSS account setup) 