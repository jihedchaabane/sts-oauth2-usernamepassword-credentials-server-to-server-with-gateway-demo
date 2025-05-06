
STS-OAUTH2-USERNAMEPASSWORD-CREDENTIALS-SERVER-TO-SERVER-WITH_GATEWAY-DEMO

# sts-oauth2-usernamepassword-credentials-server-to-server-with-gateway-demo
https://youtube.com/playlist?list=PLab_if3UBk9-AArufc8CryyhSDVqkNT-U

docker run -d \
    -e POSTGRES_HOST_AUTH_METHOD=trust \
    -e POSTGRES_USER=auth_usr \
    -e POSTGRES_PASSWORD=pwd \
    -e POSTGRES_DB=authdb \
    -p 5434:5432 postgres:13
