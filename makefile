openapi = openapi.yml
config = config.json

generate-spring: $(openapi) $(config)
	openapi-generator generate -i $(openapi) -g spring -o ./spring -c $(config)

generate-typescript: $(openapi) $(config)
	openapi-generator generate -i $(openapi) -g typescript -o ./typescript -c $(config)

generate-typescript-axios: $(openapi) $(config)
	openapi-generator generate -i $(openapi) -g typescript-axios -o ./typescript-axios -c $(config)

generate-docker-spring: $(openapi) $(config) 
	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
		-i /local/$(openapi) \
		-g spring \
		-o /local/spring \
		-c /local/$(config) \
		--global-property skipFormModel=false
		--global-property skipFormModel=false \
		--global-property skipDefaultInterface=true \
		--global-property beanValidation=true \

generate-docker-typescript: $(openapi) $(config) 
	docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/$(openapi) \
    -g typescript \
    -o /local/typescript \
		-c /local/$(config)
