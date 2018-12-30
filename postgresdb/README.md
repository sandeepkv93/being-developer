# Postgres DB
### How to install and setiup PostgresDB in Ubuntu
1. Install
```
sudo apt update
sudo apt install postgresql postgresql-contrib
```

2. Switching Over to the postgres Account
    - Switch over to the postgres account
    ```
    sudo -i -u postgres
    ```
    - To access a Postgres prompt
    ```
    psql
    ```

3. Accessing a Postgres Prompt Without Switching Accounts
```
sudo -u postgres psql
```

### Essential Commands
1. List all databases
```
\list or \l
```

2. List all tables in the current database
```
\dt
```

3. To switch databases
```
\connect database_name
```

4. Start Postgres service
```
sudo service postgresql start
```

5. Stop Postgres service
```
sudo service postgresql stop
```

6. Restart Postgres service
```
sudo service postgresql restart
```

7. To test your connection using psql
```
psql -U postgres -W
```

8. Allowing remote connections
    - Open
    ```
    sudo vim /etc/postgresql/9.6/main/pg_hba.conf
    ```
    - Scroll down to the line that describes local socket connections. It may look like this:
    ```
    local   all             all                                      peer
    ```
    Change it to
    ```
    host    all             all             0.0.0.0/0               trust
    ```
    - Open
    ```
    sudo vim /etc/postgresql/10/main/postgresql.conf
    ```
    - Under the section on Connection Settings, add or replace the line that starts with listen_addresses to respond to all requests:
    ```
    listen_addresses = '*'
    ```
    - Restart postgres
    ```
    sudo service postgresql restart
    ```

9. To list all user accounts in the PostgreSQL database server
```
\du+
```

[Reference](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-postgresql-on-ubuntu-18-04)