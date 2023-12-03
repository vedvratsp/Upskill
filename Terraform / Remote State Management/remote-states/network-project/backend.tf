terraform {
  backend "s3" {
    bucket = "vsp-terraform-backend"
    key    = "network/eip.tfstate"
    region = "us-east-1"
  }
}
