import os

input_dir = 'input'

for filename in os.listdir(input_dir):
    f = open(input_dir+"/"+filename, "r")
    o = open("output/"+filename, "w")
    lines = f.readlines()
    for line in lines:
        newline = line.replace("tpc", "tfc_ph_compat")
        o.write(newline)
    f.close()
    o.close()
    