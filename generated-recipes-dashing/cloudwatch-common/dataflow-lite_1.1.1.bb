# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Light version of dataflow libraries"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cloudwatch_common"
ROS_BPN = "dataflow_lite"

ROS_BUILD_DEPENDS = " \
    aws-common \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_common-release/archive/release/dashing/dataflow_lite/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d720611eab32f14cc0af6a7ad73b5b71"
SRC_URI[sha256sum] = "f49f3faab2dd18dd15ceee8f916745ae9b724f6e49a25f3543db72f06415605c"
S = "${WORKDIR}/cloudwatch_common-release-release-dashing-dataflow_lite-1.1.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cloudwatch-common', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cloudwatch-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-common/cloudwatch-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-common/cloudwatch-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
