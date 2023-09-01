FROM ubuntu:latest
LABEL authors="frameticket"

ENTRYPOINT ["top", "-b"]