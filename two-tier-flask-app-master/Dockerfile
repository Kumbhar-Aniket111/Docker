FROM python:3.9-slim

WORKDIR /app

COPY . .

RUN apt-get update \
    && apt-get install -y gcc default-libmysqlclient-dev pkg-config \
    && rm -rf /var/lib/apt/lists/*

RUN pip install --no-cache-dir -r requirements.txt

RUN pip install mysqlclient

CMD ["python","app.py"]