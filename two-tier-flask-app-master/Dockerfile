FROM python:3.9 AS builder

WORKDIR /app

COPY requirements.txt .

RUN apt-get update \
    && apt-get install -y gcc default-libmysqlclient-dev pkg-config \
    && rm -rf /var/lib/apt/lists/*

RUN pip install --no-cache-dir -r requirements.txt

RUN pip install mysqlclient

FROM python:3.9-slim

WORKDIR /app

# Install runtime library for mysqlclient
RUN apt-get update \
    && apt-get install -y libmariadb-dev-compat \
    && rm -rf /var/lib/apt/lists/*

COPY --from=builder /usr/local/lib/python3.9/site-packages /usr/local/lib/python3.9/site-packages

COPY . .

CMD ["python","app.py"]