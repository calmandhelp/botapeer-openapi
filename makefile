openapi = openapi.yml
config = config.json

generate-docker-typescript-axios-prod: $(openapi) $(config) 
	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/$(openapi) \
    -g typescript-axios \
    -o /local/typescript-axios \
		-c /local/$(config) \
		-s https://api.botapeer.com \
		--global-property skipFormModel=false

generate-docker-typescript-axios-dev: $(openapi) $(config) 
	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/$(openapi) \
    -g typescript-axios \
    -o /local/typescript-axios \
		-c /local/$(config) \
		--global-property skipFormModel=false

generate-docker-spring: $(openapi) $(config) 
	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
		-i /local/$(openapi) \
		-g spring \
		-o /local/spring \
		-c /local/$(config) \
		-t /local/templates/JavaSpring \
		--library spring-boot \
		--global-property skipFormModel=false \
		--global-property beanValidation=true
		