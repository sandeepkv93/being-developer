from flask import Flask
from datetime import datetime
app = Flask(__name__)

@app.route('/')
def func():
    return str(datetime.now())

if __name__ == '__main__':
    app.run()