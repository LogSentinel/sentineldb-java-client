To make a release:

- optionally regenerate using `ava -jar swagger-codegen-cli-2.2.1.jar generate -i http://localhost:8090/api-docs/def -l java -o /workspace/sentineldb-java-client`
- change the current SNAPSHOT version to a non-snapshot one (remove -SNAPSHOT)
- run `mvn clean deploy -Dgpg.passphrase=<..>`

(you need the proper gpg keys for the OSS account setup) 