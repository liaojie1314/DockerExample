curl -X PUT "127.0.0.1:9200/test.user_order" -H 'Content-Type: application/json' -d'
{
    "mappings": {
      "properties": {
        "_user_id":{"type": "text"},
        "_user_name":{"type": "text"},
        "_order_id":{"type": "text"},
        "_uuid":{"type": "text"},
        "_create_time":{"type": "date"},
        "_update_time":{"type": "date"}
      }
    }
}'
