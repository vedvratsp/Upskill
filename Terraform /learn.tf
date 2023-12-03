provider "aws" {
  region     = "us-east-1"
  access_key = "***********"
  secret_key = "***********"
}

# terraform {
#   required_providers {
#     aws = {
#         source = "hasicorp/aws"
#         version = "~> 3,0"
#     }
#   }
# }

# provider "azurerm" {
#   features {

#   }
# }

resource "aws_instance" "vedvrat11" {

  ami           = "ami-05c13eab67c5d8861"
  instance_type = "t2.micro"
  #instance_type = var.instance_type
  tags = {
    "Name" = "Ved_first_ec2"
    # name = "aws_instance.vedvrat12.${count.index}"
    # count = 5
  }

}
#  variable "instance_type" {
#     default = "t2.micro"

#  }

# variable "image_id" {
#  type = string
# }

resource "aws_instance" "vedvrat12" {

  # ami = "ami-123fjdshgbv3"
  ami           = "ami-05c13eab67c5d8861"
  instance_type = "t2.micro"
  tags = {
    "Name" = "Ved_second_ec2"
  }
  # tags = local.common_tag

}

# locals {
#   common_tag = {
#     Name = "Ved_second_ec2"
#   }
# }




# command:    terrform init , init -upgrade , constrain the versions of the providers
#             terraform plan
#             terraform apply
#             terraform apply -auto-approve
#             terraform destroy (global resopurce deploy)
#             terraform destroy -target aws_instance.vedvrat11 (target resorce destroy)
#             terraform refresh (not recommended)
#             terraform providers
#             terraform plan -var="instancetype=t2.small" loading variable value from the CLI
#             terraform fmt : foramt the code and increase readiabilty
#             terraform apply -repalce(taint=older version)

# Lifecycle: create_before_destroy : This setting controls whether the new resource is created before the old resource is destroyed during a terraform apply
#             prevent_destroy : This setting, when set to true, prevents a resource from being destroyed
#             ignore_changes : which resource attributes should be ignored when Terraform checks for changes during an apply operation
#             update : This setting allows you to specify a custom update strategy for a resource. You can use it to trigger an update when specific conditions are met
#             lifecycle : k allows you to define various lifecycle-related settings for a resource
