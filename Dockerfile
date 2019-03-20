FROM python:3.7

RUN mkdir /app
ADD ./*.py /app/

WORKDIR /app