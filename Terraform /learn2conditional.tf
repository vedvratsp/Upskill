# provider "aws" {
#   region     = "us-east-1"
#   access_key = "AKIAXUPOAGJA3J5Q3GFS"
#   secret_key = "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"
# }

# variable "istest" {}

# resource "aws_instance" "vedvrat12" {

#     ami = "ami-05c13eab67c5d8861"
#     instance_type = "t2.micro"
#     count = var.istest == true ? 3 : 0
#     tags = {
#       "Name" = "Ved_second_ec2"
#     }

# }

# resource "aws_instance" "vedvrat13" {

#     ami = "ami-05c13eab67c5d8861"
#     instance_type = "t2.micro"
#     count = var.istest == false ? 1 : 0
#     tags = {
#       "Name" = "Ved_third_ec2"
#     }

# }