### Terraform Workspace commands:
```sh
terraform workspace -h
terraform workspace show
terraform workspace new dev
terraform workspace new prd
terraform workspace list
terraform workspace select dev
```

### Terraform Based Configuration File
```sh
provider "aws" {
  region     = "ap-south-1"
  access_key = ""
  secret_key = ""
}

resource "aws_instance" "myec2" {
   ami = "ami-082b5a644766e0e6f"
   instance_type = "t2.micro"
}
```

### Terraform Final Modified Configuration File
```sh
provider "aws" {
  region     = "us-west-2"
  access_key = ""
  secret_key = ""
}

resource "aws_instance" "myec2" {
   ami = "ami-082b5a644766e0e6f"
   instance_type = lookup(var.instance_type,terraform.workspace)
}

variable "instance_type" {
  type = "map"

  default = {
    default = "t2.nano"
    dev     = "t2.micro"
    prd     = "t2.large"
  }
}
```
