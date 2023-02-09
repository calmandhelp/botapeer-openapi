openapi = openapi.yml
config = config.json

generate-spring: $(openapi) $(config)
	openapi-generator generate -i $(openapi) -g spring -o ./spring -c $(config)

generate-typescript: $(openapi) $(config)
	openapi-generator generate -i $(openapi) -g typescript -o ./typescript -c $(config)