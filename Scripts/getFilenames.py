import json, os

input_dir = 'output'

fo = open("names.txt", "w")
names = []
for filename in os.listdir(input_dir):
    f = open(input_dir+"/"+filename, "r")
    if filename.split(".")[1] == "json" :
       names.append(filename)
       names.append("\n")
    f.close()
fo.writelines(names)
fo.close()