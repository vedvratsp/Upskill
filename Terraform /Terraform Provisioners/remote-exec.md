
### Base Code:
```sh
provider "aws" {
  region     = "us-west-2"
  access_key = ""
  secret_key = ""
}


resource "aws_instance" "myec2" {
   ami = "ami-0f3769c8d8429942f"
   instance_type = "t2.micro"
}
```
### Final Code:


```sh
provider "aws" {
  region     = "us-west-2"
  access_key = ""
  secret_key = ""
}


resource "aws_instance" "myec2" {
   ami = "ami-0ca285d4c2cda3300"
   instance_type = "t2.micro"
   key_name = "terraform-key"

   connection {
   type     = "ssh"
   user     = "ec2-user"
   private_key = file("./terraform-key.pem")
   host     = self.public_ip
    }

 provisioner "remote-exec" {
   inline = [
    # Updating with the latest command for Amazon Linux machine
     "sudo yum install -y nginx",
     "sudo systemctl start nginx"
   ]
 }
}
```

```sh
terraform init
terraform plan
terraform apply -auto-approve
terraform destroy -auto-approve
```
