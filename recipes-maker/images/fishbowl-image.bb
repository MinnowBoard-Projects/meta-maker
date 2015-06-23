DESCRIPTION = "Yocto image for the maker project"

inherit core-image
include maker-image.bb

# IPython Notebook dependencies
IMAGE_INSTALL += "ipython"

# Fishbowl specific content
IMAGE_INSTALL += "fishbowl-notebook"
IMAGE_INSTALL += "minnow-broadcast"

