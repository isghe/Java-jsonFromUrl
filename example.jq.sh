. run.sh | jq '.[] | {date: .fromUrl.date, index: .index}' | jq -n '.|=[inputs]' | jq 'map(.index) | add'

