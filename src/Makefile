IMAGE_NAME = mi_app

#make build -> construye la imagen

build:
	docker build -t $(IMAGE_NAME) -f dockerfile .

#make run -> ejecutael contenedor y luego lo borra al terminarlo

run:
	docker run --rm $(IMAGE_NAME)

#make all -> construye y luego ejecuta
all: build run

#make clean -> borra la imagen
clean:
	docker rmi $(IMAGE_NAME)

 .PHONY: build run all clean