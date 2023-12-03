terraform {
  backend "s3" {
    bucket = "vsp-terraform-backend"
    key    = "network/terraform.tfstate"
    region = "us-east-1"
  }
}
