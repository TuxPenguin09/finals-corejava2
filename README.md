# Finals Project for Core Java 2

## Docker Instructions:
1. Install Docker
2. Create a volume specifically for MySQL:
`docker volume create mysql_data`
3. Pull the latest MySQL image:
`docker pull mysql:latest`
4. Run MySQL as container:
```shell
docker run -d --name mysql_java_finals \
  -e MYSQL_ROOT_PASSWORD=password \
  -e MYSQL_DATABASE=finals \
  -e MYSQL_USER=username \
  -e MYSQL_PASSWORD=password \
  -v mysql_data:/var/lib/mysql \
  -p 3306:3306 \
  mysql:latest
```
5. Execute SQL in `sql/init.sql`
   - Use any software like MySQL Workbench, TablePlus or phpMyAdmin to execute that SQL file in a MySQL Database server.
   - Here are the credentials of the MySQL database by default
     - Host: `127.0.0.1:3306`
     - Username: `username`
     - Password: `password`
     - Database: `finals`
   - You can add or edit any rows for the `INSERT` block.

## Members
- aliamanuba
- reiji
- vogelante
