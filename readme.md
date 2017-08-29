use run.sh for localhost testing, puts this instance on 8082

You can test its "orders" endpoint with curl like so

curl -X POST -d "customers=C100" -H "Content-Type: application/x-www-form-urlencoded" http://localhost:8082/api/customer/orders