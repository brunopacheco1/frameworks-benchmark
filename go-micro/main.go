package main

import (
	"go-micro.dev/v4"
	"log"
)

func main() {
	// Create a new service
	service := micro.NewService(
		micro.Address(":8000"),
	)

	// Initialize the service
	service.Init()

	// Start the service
	if err := service.Run(); err != nil {
		log.Fatal(err)
	}
}
