# Copyright (c) 2019 LG Electronics, Inc.

ALLOW_EMPTY_${PN} = "1"

# This component puts its cmake files under libdir instead of datadir.
FILES_${PN}-dev_prepend = " \
    ${libdir}/${ROS_BPN}/cmake \
"
