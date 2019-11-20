# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_crystal
inherit ros_superflore_generated

DESCRIPTION = "A configuration package defining the runtime for the ROS interfaces."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_defaults"
ROS_BPN = "rosidl_default_runtime"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rosidl-generator-cpp \
    rosidl-generator-py \
    rosidl-typesupport-c \
    rosidl-typesupport-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/crystal/rosidl_default_runtime/0.6.0-0.tar.gz
ROS_BRANCH ?= "branch=release/crystal/rosidl_default_runtime"
SRC_URI = "git://github.com/ros2-gbp/rosidl_defaults-release;${ROS_BRANCH};protocol=https"
SRCREV = "c937a5cb94595c11ddfd6257099c239537e065e0"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosidl-defaults', d)}"
ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
