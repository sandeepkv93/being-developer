# Creating Flask App and deploying it in Heroku
## Live Demo - https://flaskdemobasic.herokuapp.com

## Create a Flask App
1. Create a virtual environment
    - In Windows
    ```shell
    virtualenv env
    cd env\Scripts
    .\activate
    ```

    - In Linux/Mac
    ```shell
    virtualenv env
    source env/bin/activate
    ```
2. Install Flask Module
    ```shell
    pip install Flask --upgrade
    ```

3. Create a .gitignore file and add the following lines
    ```
    __pycache__/
    *.py[cod]
    .vscode
    env/
    ```

3. Sample Flask app which returns current Date
    ```python
    from flask import Flask
    from datetime import datetime
    app = Flask(__name__)

    @app.route('/')
    def func():
        return str(datetime.now())

    if __name__ == '__main__':
        app.run()
    ```
4. Run the app
    ```shell
    python app.py
    ```
    When you goto http://localhost:5000/ you should be able to see current date and time.

## Deploying this app in Heroku
1. Create a new file and name it as **Procfile** in the project's root folder and add the following text
    ```
    web: gunicorn app:app
    ```

2. Add **guicorn** module and other installed modules to requirements.txt
    ```shell
    pip install gunicorn --upgrade
    pip freeze > requirements.txt
    ```

3. Specify a python runtime. Example: python-3.6.2
    - Create a file called **runtime.txt** in the project's root folder and add the following text
    ```
    python-3.6.2
    ```

4. Create a heroku app
    ```shell
    heroku create flaskdemoapp
    ```

5. Initialize git and add remote as heroku
    ```shell
    git init
    git remote add prod git@heroku.com:flaskdemoapp.git
    ```

6. Commit and push
    ```shell
    git add .
    git commit -m "Your message"
    git push -u prod master
    ```

7. Incase if you had not added public key, then
    ```shell
    heroku login #Username & Password
    heroku keys:add ~/.ssh/id_rsa.pub
    ```